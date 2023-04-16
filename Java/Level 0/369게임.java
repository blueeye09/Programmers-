/*
머쓱이는 친구들과 369게임을 하고 있습니다.
369게임은 1부터 숫자를 하나씩 대며 3, 6, 9가 들어가는 숫자는 숫자 대신
3, 6, 9의 개수만큼 박수를 치는 게임입니다.
머쓱이가 말해야하는 숫자 order 가 매개변수로 주어질 때,
머쓱이가 쳐야할 박수 횟수를 return 하도록 solution 함수를 완성해보세요.
*/
class Solution {
    public int solution(int order) {
        int numDigits = (int) Math.log10(order) + 1; // 자릿 수 계산
        int[] digits = new int[numDigits];

        for (int i = numDigits - 1; i >= 0; i--) {
            digits[i] = order % 10;
            order /= 10;
        }

        int answer = 0;

        for (int i : digits) {
            if ((i == 3) || (i == 6) || (i == 9))
                answer++;
        }

        return answer;
    }
}