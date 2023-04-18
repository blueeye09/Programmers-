/*
정수 n과 정수 배열 numlist 가 매개변수로 주어질 때,
numlist 에서 n의 배수가 아닌 수들을 제거한 배열을
return 하도록 solution 함수를 완성해주세요.
 */
import java.util.ArrayList;
import java.util.List;
class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> num = new ArrayList<>();

        for (int i = 0; i < numlist.length; i++) {
            if (numlist[i] % n == 0){
                num.add(numlist[i]);
            }
        }
        int[] answer = num.stream().mapToInt(x -> x).toArray();
        return answer;
    }
}

/*
class Solution {
    public int[] solution(int n, int[] numList) {
        return Arrays.stream(numList).filter(value -> value % n == 0).toArray();
    }
}
 */