public class Solution {
    public int[] solution(int[] num_list) {
        int j = num_list.length;
        int[] answer = new int[j];

        for (int i = 0; i < num_list.length; i++){
            answer[i] = num_list[j-1];
            j--;
        }

        return answer;
    }
}