/*
어떤 자연수를 제곱했을 때 나오는 정수를 제곱수라고 합니다.
정수 n이 매개변수로 주어질 때,
n이 제곱수라면 1을 아니라면 2를
return 하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int solution(int n) {
        int answer = 2;

        for (int i = 0 ; i <= 1000; i++) {
            if ((int)Math.pow(i, 2) == n){
                answer = 1;
                break;
            }
        }

        return answer;
    }
}