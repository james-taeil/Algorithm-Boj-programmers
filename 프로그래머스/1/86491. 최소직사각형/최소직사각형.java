import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        
        // 완전 탐색
        int len = sizes.length;
        int totalMax = Integer.MIN_VALUE;
        int totalMin = Integer.MIN_VALUE;
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        
        for (int i = 0; i < len; i++) {
            maxNum = Math.max(sizes[i][0], sizes[i][1]);
            minNum = Math.min(sizes[i][0], sizes[i][1]);
            
            totalMax = Math.max(maxNum, totalMax);
            totalMin = Math.max(minNum, totalMin);
        }
        
        answer = totalMax * totalMin;
        
        return answer;
    }
}