/*
최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다.
정수 배열 array가 매개변수로 주어질 때,
최빈값을 return 하도록 solution 함수를 완성해보세요.
최빈값이 여러 개면 -1을 return 합니다.
*/
import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++){
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else {
                int count = map.get(array[i]) + 1;
                map.put(array[i], count);
            }
        }

        int maxCount = 0;

        for (int key : map.keySet()) {
            int count = map.get(key);
            if (count > maxCount) {
                maxCount = count;
                answer = key;
            } else if (count == maxCount) {
                answer = -1;
            }
        }

        return answer;
    }
}