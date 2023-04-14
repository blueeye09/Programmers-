/*
정수가 담긴 배열 numbers 와 문자열 direction 가 매개변수로 주어집니다.
배열 numbers 의 원소를 direction 방향으로 한 칸씩 회전시킨 배열을
return 하도록 solution 함수를 완성해주세요.
*/
import java.util.ArrayDeque;
import java.util.Deque;
class Solution {
    public int[] solution(int[] numbers, String direction) {
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i : numbers) {
            deque.add(i);
        }

        if (direction.equals("right")) {
            deque.addFirst(deque.removeLast());
        }
        else if (direction.equals("left")) {
            deque.addLast(deque.removeFirst());
        }

        return deque.stream().mapToInt(i -> i).toArray();
    }
}