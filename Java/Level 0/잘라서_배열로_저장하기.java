/*
문자열 my_str 과 n이 매개변수로 주어질 때,
my_str 을 길이 n씩 잘라서 저장한 배열을
return 하도록 solution 함수를 완성해주세요.
 */
class Solution {
    public String[] solution(String my_str, int n) {
        int numOfSubStrings = (int) Math.ceil((double) my_str.length() / n);
        String[] answer = new String[numOfSubStrings];

        for (int i = 0; i < numOfSubStrings; i++) {
            if (i == numOfSubStrings - 1) {
                answer[i] = my_str.substring(i * n);
            } else {
                answer[i] = my_str.substring(i * n, (i + 1) * n);
            }
        }

        return answer;
    }
}