/*
문자열 my_string 이 매개변수로 주어집니다.
my_string 을 거꾸로 뒤집은 문자열을 return 하도록 solution 함수를 완성해주세요.
 */

class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = my_string.length() - 1; i >= 0; i--){
            answer += my_string.charAt(i);
        }
        return answer;
    }
}