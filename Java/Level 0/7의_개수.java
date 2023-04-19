import java.util.Arrays;

/*
머쓱이는 행운의 숫자 7을 가장 좋아합니다.
정수 배열 array 가 매개변수로 주어질 때,
7이 총 몇 개 있는지 return 하도록 solution 함수를 완성해보세요.
 */
class Solution {
    public int solution(int[] array) {
        int answer = 0;

        for (int i : array) {
            while (i > 0) {
                if (i % 10 == 7) {
                    answer++;
                }
                i /= 10;
            }
        }
        return answer;
    }
}