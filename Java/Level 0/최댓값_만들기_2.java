/*
정수 배열 numbers 가 매개변수로 주어집니다.
numbers 의 원소 중 두 개를 곱해 만들 수 있는
최댓값을 return 하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;

        if (numbers.length == 2)
            answer = numbers[0] * numbers[1];

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (answer < numbers[i] * numbers[j]) {
                    answer = numbers[i] * numbers[j];
                }
            }
        }
        return answer;
    }
}