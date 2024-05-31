import java.util.Queue;
import java.util.LinkedList;

class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        
        Queue<Integer> q = new LinkedList();
        int len = num_list.length;
        
        for (int i = 0; i < len; i++) {
            q.add(num_list[i]);
        }
        
        for (int i = 0; i < n; i++) {
            q.add(q.peek());
            q.remove();
        }
        
        answer = q.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}