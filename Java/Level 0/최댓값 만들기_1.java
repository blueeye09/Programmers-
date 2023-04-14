/*
정수 배열 numbers 가 매개변수로 주어집니다.
numbers 의 원소 중 두 개를 곱해 만들 수 있는 최댓값을
return 하도록 solution 함수를 완성해주세요.
*/
import java.util.Arrays;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}