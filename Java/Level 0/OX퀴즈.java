/*
덧셈, 뺄셈 수식들이 'X [연산자] Y = Z' 형태로 들어있는
문자열 배열 quiz 가 매개변수로 주어집니다.
수식이 옳다면 "O"를 틀리다면 "X"를 순서대로 담은 배열을
return 하도록 solution 함수를 완성해주세요.
 */

class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++){
            int result = 0;
            String[] equation = quiz[i].split(" ");
            int x = Integer.parseInt(equation[0]);
            char operator = equation[1].charAt(0);
            int y = Integer.parseInt(equation[2]);
            int z = Integer.parseInt(equation[4]);

            if (operator == '+') {
                result = x + y;
            } else if (operator == '-') {
                result = x - y;
            }

            answer[i] = result == z ? "O" : "X";
        }

        return answer;
    }
}