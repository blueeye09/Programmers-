/*
영어가 싫은 머쓱이는 영어로 표기되어있는 숫자를 수로 바꾸려고 합니다.
문자열 numbers 가 매개변수로 주어질 때,
numbers 를 정수로 바꿔 return 하도록
solution 함수를 완성해 주세요.
*/
import java.util.HashMap;
class Solution {
    public long solution(String numbers) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);

        String num = "";
        long answer = 0;

        for (char ch : numbers.toCharArray()) {
            num += ch;
            if (map.containsKey(num)) {
                answer = answer * 10 + map.get(num);
                num = "";
            }
        }

        return answer;
    }
}