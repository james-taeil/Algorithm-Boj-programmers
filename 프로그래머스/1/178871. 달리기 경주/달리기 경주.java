import java.util.*;

class Solution {
    static HashMap<String, Integer> map = new HashMap<>();
    
    public String[] solution(String[] players, String[] callings) {        
        String[] answer = {};
        // 버블 정렬 응용
        
        int len = players.length;
        int idx;
//         for (int i = 0; i < len; i++) {
//             callings를 불렀을 경우
//             idx = Arrays.asList(players).indexOf(callings[i]);
//             swap(players, idx);
//         }
        
        // map init
        for (int i = 0; i < len; i++) {
            map.put(players[i], i);
        }
        
        for (String calling : callings) {
            idx = map.get(calling);
            swap(players, idx);
        }
        
        answer = players;
        
        return answer;
    }
    
    public static void swap(String[] players, int idx) {
        String temp = players[idx];
        players[idx] = players[idx - 1];
        players[idx - 1] = temp;
        
        // map update - 업데이트 후 니까 
        map.put(players[idx], idx);
        map.put(players[idx - 1], idx - 1);
        
    }
}