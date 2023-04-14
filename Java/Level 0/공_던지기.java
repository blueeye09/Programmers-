/*
머쓱이는 친구들과 동그랗게 서서 공 던지기 게임을 하고 있습니다.
공은 1번부터 던지며 오른쪽으로 한 명을 건너뛰고 그다음 사람에게만 던질 수 있습니다.
친구들의 번호가 들어있는 정수 배열 numbers 와 정수 K가 주어질 때,
k 번째로 공을 던지는 사람의 번호는 무엇인지 return 하도록
solution 함수를 완성해보세요.
*/
import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int solution(int[] numbers, int k) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i : numbers) {
            deque.add(i);
        }
        while (k > 1) {
            // 맨 앞에 두개를 빼서 뒤에 넣음
            deque.addLast(deque.removeFirst());
            deque.addLast(deque.removeFirst());
            k--;
        }
        // 제일 첫 요소 return
        return deque.getFirst();
    }
}