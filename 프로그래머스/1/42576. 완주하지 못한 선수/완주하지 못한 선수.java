import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        // hashmap을 활용하여 문제를 푼다면
        HashMap<String, Integer> map = new HashMap<>();
        
        // 1. 참가자 이름 카운트 늘리기
        for (String player : participant) {
            map.put(player, map.getOrDefault (player, 0) + 1);
        }
        
        // 2. 완주한 참가자 이름 카운트 줄이기
        for (String player : completion) {
            map.put(player, map.get(player) - 1);
        }
        
        
        // 3. 마지막에 남은 hash가 완주하지 못한 선수
        
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return entry.getKey();
            }
        }
        
             
        return "";
    }
}