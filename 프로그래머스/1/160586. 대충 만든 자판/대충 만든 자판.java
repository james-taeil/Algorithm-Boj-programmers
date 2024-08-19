import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 구현
        // target 한바퀴 도는 동안 keymap에서 찾아야함
        // keymap hashmap으로 하면 효율 괜찮을듯
        // keymap setting 시 최소값으로 저장
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int tarLen = targets.length;
        int mapLen = keymap.length;
        int[] answer = new int[tarLen];
        
        // setting
        for (int i = 0; i < mapLen; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                char curr = keymap[i].charAt(j);
                
                if (map.containsKey(curr)) {
                    int idx = map.get(curr);
                    map.put(curr, Math.min(j + 1, idx));
                } else {
                    map.put(curr, j + 1);
                }
            }
        }
        
        // logic
        for (int i = 0; i < tarLen; i++) {
            String target = targets[i];
            int count = 0;
            boolean flag = true;
            
            for (char curr : target.toCharArray()) {
                if (map.containsKey(curr)) {
                    count += map.get(curr);
                } else {
                    flag = false;
                    break;
                }
            }
            
            answer[i] = flag == false ? -1 : count;
        }
        
        
        
        return answer;
    }
}