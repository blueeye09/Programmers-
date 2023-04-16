/*
정수 배열 array 와 정수 n이 매개변수로 주어질 때,
array 에 들어있는 정수 중 n과 가장 가까운 수를 return 하도록
solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(int[] array, int n) {
        int answer = array[0];

        for (int i : array) {
            if (Math.abs(i - n) < Math.abs(answer - n)) {
                answer = i;
            } else if (Math.abs(i - n) == Math.abs(answer - n)) {
                answer = Math.min(i, answer);
            }
        }

        return answer;
    }
}