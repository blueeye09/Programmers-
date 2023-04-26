/*
PROGRAMMERS-962 행성에 불시착한 우주비행사 머쓱이는
외계행성의 언어를 공부하려고 합니다.
알파벳이 담긴 배열 spell 과 외계어 사전 dic 이 매개변수로 주어집니다.
spell 에 담긴 알파벳을 한번씩만 모두 사용한 단어가 dic 에 존재한다면 1,
존재하지 않는다면 2를 return 하도록 solution 함수를 완성해주세요.
 */
class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        for (int i = 0; i < dic.length; i++){
            int cnt = 0;
            if (dic[i].length() != spell.length)
                continue;
            else {
                for (int j = 0; j< spell.length; j++) {
                    if (dic[i].contains(spell[j])){
                        cnt++;
                    }
                    if (cnt == spell.length)
                        answer = 1;
                    else
                        answer = 2;
                }
            }
        }
        return answer;
    }
}