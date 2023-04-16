/*
문자열 my_string 이 매개변수로 주어질 때,
대문자는 소문자로 소문자는 대문자로 변환한 문자열을
return 하도록 solution 함수를 완성해주세요.
*/
import java.util.*;

class Solution {
    public String solution(String my_string) {
        Queue<Character> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        for (char c : my_string.toCharArray()) {
            if (Character.isUpperCase(c)) {
                queue.add(Character.toLowerCase(c));
            } else {
                queue.add(Character.toUpperCase(c));
            }
        }

        while (!queue.isEmpty()) {
            sb.append(queue.poll());
        }

        return sb.toString();
    }
}