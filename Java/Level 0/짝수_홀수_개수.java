/*
정수가 담긴 리스트 num_list 가 주어질 때,
num_list 의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록
solution 함수를 완성해보세요.
 */

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int odd = 0;
        int even = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i] % 2 == 0)
                even++;
            else
                odd++;
        }
        answer[0] = even;
        answer[1] = odd;
        return answer;
    }
}