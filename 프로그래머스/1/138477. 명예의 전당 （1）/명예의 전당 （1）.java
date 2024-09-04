import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        // 우선순위큐
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int len = score.length;
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            pq.add(score[i]);
            
            if (pq.size() > k) {
                pq.poll();
            }
            
            answer[i] = pq.peek();
        }
        
        return answer;
    }
}