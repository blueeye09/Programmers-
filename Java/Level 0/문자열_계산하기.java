import java.util.Arrays;

/*
my_string 은 "3 + 5"처럼 문자열로 된 수식입니다.
문자열 my_string 이 매개변수로 주어질 때,
수식을 계산한 값을 return 하는 solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");

        int answer = Integer.parseInt(str[0]);

        for (int i = 1; i < str.length; i += 2) {
            if (str[i].equals("+")) {
                answer += Integer.parseInt(str[i+1]);
            } else if (str[i].equals("-")) {
                answer -=Integer.parseInt(str[i+1]);
            }

        }
        return answer;
    }
}