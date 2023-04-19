/*
2차원 좌표 평면에 변이 축과 평행한 직사각형이 있습니다.
직사각형 네 꼭짓점의 좌표 [[x1, y1], [x2, y2], [x3, y3], [x4, y4]]가
담겨있는 배열 dots 가 매개변수로 주어질 때,
직사각형의 넓이를 return 하도록 solution 함수를 완성해보세요.
*/
class Solution {
    public int solution(int[][] dots) {
        int width = dots[0][0];
        int height = dots[0][1];

        for (int i = 0; i < dots.length; i++) {
            if (width != dots[i][0]) {
                width = Math.abs(dots[i][0] - dots[0][0]);
                break;
            }
        }

        for (int i = 0; i < dots.length; i++) {
            if (height != dots[i][1]) {
                height = Math.abs(dots[i][1] - dots[0][1]);
                break;
            }
        }
        return width * height;
    }
}