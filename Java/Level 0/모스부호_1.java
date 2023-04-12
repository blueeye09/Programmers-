/*
머쓱이는 친구에게 모스부호를 이용한 편지를 받았습니다.
그냥은 읽을 수 없어 이를 해독하는 프로그램을 만들려고 합니다.
문자열 letter 가 매개변수로 주어질 때,
letter 를 영어 소문자로 바꾼 문자열을 return 하도록
solution 함수를 완성해보세요.
모스부호는 다음과 같습니다.
morse = {
    '.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f',
    '--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l',
    '--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r',
    '...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x',
    '-.--':'y','--..':'z'
}
*/
import java.util.HashMap;

class Solution {
    public String solution(String letter) {
        HashMap<String, String> morseMap = new HashMap<String, String>();
        morseMap.put(".-", "a");
        morseMap.put("-...", "b");
        morseMap.put("-.-.", "c");
        morseMap.put("-..", "d");
        morseMap.put(".", "e");
        morseMap.put("..-.", "f");
        morseMap.put("--.", "g");
        morseMap.put("....", "h");
        morseMap.put("..", "i");
        morseMap.put(".---", "j");
        morseMap.put("-.-", "k");
        morseMap.put(".-..", "l");
        morseMap.put("--", "m");
        morseMap.put("-.", "n");
        morseMap.put("---", "o");
        morseMap.put(".--.", "p");
        morseMap.put("--.-", "q");
        morseMap.put(".-.", "r");
        morseMap.put("...", "s");
        morseMap.put("-", "t");
        morseMap.put("..-", "u");
        morseMap.put("...-", "v");
        morseMap.put(".--", "w");
        morseMap.put("-..-", "x");
        morseMap.put("-.--", "y");
        morseMap.put("--..", "z");

        String[] morse = letter.split(" ");
        String answer = "";

        for (int i = 0; i < morse.length; i++){
            answer += morseMap.get(morse[i]);
        }
        return answer;
    }
}