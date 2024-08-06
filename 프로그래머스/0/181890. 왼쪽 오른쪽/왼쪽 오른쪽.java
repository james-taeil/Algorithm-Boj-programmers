import java.util.*;

class Solution {
    public String[] solution(String[] str_list) {
        String[] answer = {};
        
        List<String> list = new ArrayList<>();
        
        int len = str_list.length;
        int lLen = Integer.MAX_VALUE;
        int rLen = Integer.MAX_VALUE;
        int minNum = 0;
        
        for (int i = 0; i < len; i++) {
            if (str_list[i].equals("l")) {
                lLen = i;
                break;
            }
        }
        
        for (int i = 0; i < len; i++) {
            if (str_list[i].equals("r")) {
                rLen = i;
                break;
            }
        }
        
        minNum = Math.min(lLen, rLen);
  
        if (lLen > 20 && rLen > 20) {
            return answer;
        }
        
        if (lLen == minNum) {
            for (int i = 0; i < minNum; i++) {
               list.add(str_list[i]);
            }    
        }
        if (rLen == minNum) {
            for (int i = minNum + 1; i < len; i++) {
                list.add(str_list[i]);
            }
        }
    
        answer = list.stream().toArray(String[] :: new);
        
        return answer;
    }
}