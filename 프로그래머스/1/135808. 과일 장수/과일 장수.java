import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int len = score.length;
        int minNum = Integer.MAX_VALUE;
        Arrays.sort(score);
        
        for (int i = len - m; i >= 0; i -= m) {
            answer += score[i] * m;
        }
        
        return answer;
    }
}