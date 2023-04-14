/*
영어에선 a, e, i, o, u 다섯 가지 알파벳을 모음으로 분류합니다.
문자열 my_string 이 매개변수로 주어질 때
모음을 제거한 문자열을 return 하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public String solution(String my_string) {
        String answer = "";

        for (int i = 0; i < my_string.length(); i++){
            switch (my_string.charAt(i)){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    break;
                default: answer += my_string.charAt(i);
            }
        }

        return answer;
    }
}