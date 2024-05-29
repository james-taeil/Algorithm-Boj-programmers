import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        List<Integer> list = new ArrayList();
        int len = arr.length;
        int startIdx = -1;
        int endIdx = -1;
        
        for (int i = 0; i < len; i++) {
            if (arr[i] == 2 && startIdx == -1) {
                startIdx = i;
            }
            
            if (arr[i] == 2 && startIdx != -1) {
                endIdx = i;
            }
        }
        
        if (startIdx == -1) {
            answer = new int[1];
            answer[0] = -1;
            return answer;
        }
        
        for (int i = startIdx; i <= endIdx; i++) {
            list.add(arr[i]);
        }
        
        answer = list.stream().mapToInt(Integer :: intValue).toArray();
        
        return answer;
    }
}