import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int result = 0;
        int len = d.length;
        
        Arrays.sort(d);
        
        for (int i = 0; i < len; i++) {
            result += d[i];
            if (result > budget) {
                answer = i;
                break;
            }
        }
        
        if (result <= budget) {
            answer = d.length;
        }
        return answer;
    }
}