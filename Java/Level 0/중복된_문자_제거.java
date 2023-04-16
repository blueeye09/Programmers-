/*
문자열 my_string 이 매개변수로 주어집니다.
my_string 에서 중복된 문자를 제거하고
하나의 문자만 남긴 문자열을 return 하도록
solution 함수를 완성해주세요.
*/
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public String solution(String my_string) {
        Set<Character> charSet = new LinkedHashSet<>();

        for (int i = 0; i < my_string.length(); i++) {
            charSet.add(my_string.charAt(i));
        }

        StringBuilder sb = new StringBuilder();
        for (Character ch : charSet)
            sb.append(ch);

        return sb.toString();

    }
}