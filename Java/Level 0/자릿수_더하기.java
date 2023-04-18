/*
정수 n이 매개변수로 주어질 때 n의 각 자리 숫자의 합을
return 하도록 solution 함수를 완성해주세요
*/
class Solution {
    public int solution(int n) {
        String str = Integer.toString(n);
        char[] ch = str.toCharArray();

        int answer = 0;

        for (int i = 0 ; i < ch.length; i++) {
            answer += (ch[i] - '0');
        }

        return answer;
    }
}