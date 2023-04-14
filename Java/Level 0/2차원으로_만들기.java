/*
정수 배열 num_list 와 정수 n이 매개변수로 주어집니다.
num_list 를 다음 설명과 같이 2차원 배열로 바꿔
return 하도록 solution 함수를 완성해주세요.

num_lis t가 [1, 2, 3, 4, 5, 6, 7, 8] 로 길이가 8이고
 n이 2이므로 num_list 를 2 * 4 배열로 다음과 같이 변경합니다.
2차원으로 바꿀 때에는 num_list 의 원소들을
앞에서부터 n개씩 나눠 2차원 배열로 변경합니다.
*/
class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int j = 0;
        int k = 0;
        for (int i = 0; i < num_list.length; i++) {
                answer[j][k] = num_list[i];
                if (k++ == n - 1) {
                k = 0;
                j++;
            }
        }

        return answer;
    }
}