/*
정수 num 과 k가 매개변수로 주어질 때,
num 을 이루는 숫자 중에 k가 있으면
num 의 그 숫자가 있는 자리 수를
return 하고 없으면
-1을 return 하도록 solution 함수를 완성해보세요.
 */
class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        char[] ch = str.toCharArray();

        int answer = -1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] - '0' == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}