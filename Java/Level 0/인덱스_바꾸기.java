/*
문자열 my_string 과 정수 num1, num2가 매개변수로 주어질 때,
my_string 에서 인덱스 num1과 인덱스 num2에 해당하는 문자를
바꾼 문자열을 return 하도록 solution 함수를 완성해보세요.
*/
class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();
        char temp = charArray[num1];
        charArray[num1] = charArray[num2];
        charArray[num2] = temp;

        return new String(charArray);
    }
}