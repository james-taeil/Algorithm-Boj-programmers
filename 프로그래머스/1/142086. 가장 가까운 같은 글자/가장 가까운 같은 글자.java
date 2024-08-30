import java.util.*;

class Solution {
    public int[] solution(String s) {        
        HashMap<Character, Integer> map = new HashMap<>();
        
        int len = s.length();
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);
            
            if (!map.containsKey(curr)) {
                answer[i] = -1;
                map.put(curr, i);
            } else {
                answer[i] = i - map.get(curr);
                map.put(curr, i);
            }
        }
        
        return answer;
    }
}