/*
정수 배열 array 가 매개변수로 주어질 때,
가장 큰 수와 그 수의 인덱스를 담은 배열을
return 하도록 solution 함수를 완성해보세요.
*/
class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];

        int large = 0;
        int index = 0;

        for (int i = 0; i< array.length; i++) {
            if (large < array[i]){
                large = array[i];
                index = i;
            }
        }
        answer[0] = large;
        answer[1] = index;

        return answer;
    }
}