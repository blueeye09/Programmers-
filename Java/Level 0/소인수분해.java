/*
소인수분해란 어떤 수를 소수들의 곱으로 표현하는 것입니다.
예를 들어 12를 소인수 분해하면 2 * 2 * 3 으로 나타낼 수 있습니다.
따라서 12의 소인수는 2와 3입니다. 자연수 n이 매개변수로 주어질 때
n의 소인수를 오름차순으로 담은 배열을 return 하도록 solution 함수를 완성해주세요.
*/
import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> factors = new ArrayList<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                factors.add(i);
                n /= i;
            }
        }
        // 중복 제거 과정
        // Set 은 중복을 허용하지 않는 Collection
        // Hashset 은 Set 인터페이스를 구현한 클래스
        Set<Integer> set = new HashSet<>(factors);
        ArrayList<Integer> uniqueFactors = new ArrayList<>(set);

        int[] answer = new int[uniqueFactors.size()];
        for (int i = 0; i < uniqueFactors.size(); i++) {
            answer[i] = uniqueFactors.get(i);
        }
        Arrays.sort(answer);

        return answer;
    }
}