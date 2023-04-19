/*
한 개 이상의 항의 합으로 이루어진 식을 다항식이라고 합니다.
다항식을 계산할 때는 동류항끼리 계산해 정리합니다.
덧셈으로 이루어진 다항식 polynomial 이 매개변수로 주어질 때,
동류항끼리 더한 결괏값을 문자열로 return 하도록 solution 함수를 완성해보세요.
같은 식이라면 가장 짧은 수식을 return 합니다.
*/
class Solution {
    public String solution(String polynomial) {
        String[] str = polynomial.split(" ");
        int linear = 0;
        int constant = 0;

        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("x")) {
                if (str[i].equals("x"))
                    linear += 1;
                else {
                    linear += Integer.parseInt(str[i].replace("x", ""));
                }
            }
            else if (!str[i].equals("+")){
                constant += Integer.parseInt(str[i]);
            }
        }

        String answer = "";
        if (linear == 0 && constant > 0){
            answer = constant + "";
        } else if(linear > 0 && constant == 0) {
            if (linear == 1) {
                answer = "x";
            } else {
                answer = linear + "x";
            }
        } else if(linear > 0 && constant > 0) {
            if (linear == 1) {
                answer = "x" + " + " + constant;
            } else{
                answer = linear + "x" + " + " + constant;
            }
        }

        return answer;
    }
}