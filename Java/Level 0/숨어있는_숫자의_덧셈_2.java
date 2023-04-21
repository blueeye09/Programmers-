/*
문자열 my_string 이 매개변수로 주어집니다.
my_string 은 소문자, 대문자, 자연수로만 구성되어있습니다.
my_string 안의 자연수들의 합을
return 하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(String my_string) {
        int answer = 0;

        String[] str = my_string.replaceAll("[A-za-z]", " ").split(" ");

        for (String s : str) {
            if(!s.equals("")) answer += Integer.valueOf(s);
        }

        return answer;
    }
}