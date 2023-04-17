/*
문자열 s가 매개변수로 주어집니다.
s에서 한 번만 등장하는 문자를 사전 순으로 정렬한 문자열을 return 하도록
solution 함수를 완성해보세요.
한 번만 등장하는 문자가 없을 경우 빈 문자열을 return 합니다.
*/
import java.util.Arrays;
class Solution {
    public String solution(String s) {
        boolean[] confirm = new boolean[s.length()];

        for (int i = 0; i < s.length(); i++){
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    confirm[i] = true;
                    confirm[j] = true;
                }
            }
        }
        String answer = "";
        for (int i = 0; i < s.length(); i++) {
            if (!confirm[i]) {
                answer += s.charAt(i);
            }
        }
        char ch[] = answer.toCharArray();
        Arrays.sort(ch);

        return new String(ch);
    }
}