/*
머쓱이는 RPG 게임을 하고 있습니다.
게임에는 up, down, left, right 방향키가 있으며
각 키를 누르면 위, 아래, 왼쪽, 오른쪽으로 한 칸씩 이동합니다.
예를 들어 [0,0]에서 up을 누른다면 캐릭터의 좌표는 [0, 1],
down 을 누른다면 [0, -1], left 를 누른다면 [-1, 0],
right 를 누른다면 [1, 0]입니다.
머쓱이가 입력한 방향키의 배열 keyinput와
맵의 크기 board 이 매개변수로 주어집니다.
캐릭터는 항상 [0,0]에서 시작할 때 키 입력이 모두 끝난 뒤에
캐릭터의 좌표 [x, y]를 return 하도록 solution 함수를 완성해주세요.
*/
class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = new int[2];

        int width = 0;
        int height = 0;
        System.out.println(-board[1] / 2);
        for (int i = 0; i < keyinput.length; i++) {
            if (keyinput[i].equals("left")) {
                if (width != (-board[0] / 2)){
                    width--;
                }
            } else if (keyinput[i].equals("right")) {
                if (width != (board[0] / 2)) {
                    width++;
                }
            } else if (keyinput[i].equals("up")) {
                if (height != (board[1] / 2)) {
                    height++;
                }
            } else if (keyinput[i].equals("down")) {
                if (height != (-board[1] / 2)) {
                    height--;
                }
            }
        }

        answer[0] = width;
        answer[1] = height;

        return answer;
    }
}