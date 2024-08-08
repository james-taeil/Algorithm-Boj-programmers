import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        // hashmap 응용하여 for 문 한번으로 풀기
        HashMap<String, Integer> map = new HashMap<>();
        
        int len = name.length;
        int sum = 0;
        int photoLen = photo.length;
        int[] answer = new int[photoLen];
        
        for (int i = 0; i < len; i++) {
            map.put(name[i], yearning[i]);
        }
        
        for (int i = 0; i < photoLen; i++) {
            for (String callName : photo[i]) {
                sum += map.getOrDefault(callName, 0);
            }
            answer[i] = sum;
            sum = 0;
        }
        
        return answer;
    }
}