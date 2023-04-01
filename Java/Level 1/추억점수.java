import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // 인물 이름과 그리움 점수를 매핑하는 맵 생성
        Map<String, Integer> yearningMap = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            yearningMap.put(name[i], yearning[i]);
        }

        // 각 사진별 추억 점수 계산
        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int sum = 0;
            for (String person : photo[i]) {
                if (yearningMap.containsKey(person)) {
                    sum += yearningMap.get(person);
                }
            }
            answer[i] = sum;
        }

        return answer;
    }
}