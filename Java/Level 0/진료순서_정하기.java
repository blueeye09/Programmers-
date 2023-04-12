/*
외과의사 머쓱이는 응급실에 온 환자의 응급도를 기준으로 진료 순서를 정하려고 합니다.
정수 배열 emergency 가 매개변수로 주어질 때
응급도가 높은 순서대로 진료 순서를 정한 배열을 return 하도록
solution 함수를 완성해주세요.
*/
import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < emergency.length; i++) {
            queue.add(emergency[i]);
        }

        int[] answer = new int[emergency.length];
        for (int i = 0; i < emergency.length; i++) {
            int priority = queue.poll();
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[j] == priority) {
                    answer[j] = i;
                    answer[j]++;
                    emergency[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}