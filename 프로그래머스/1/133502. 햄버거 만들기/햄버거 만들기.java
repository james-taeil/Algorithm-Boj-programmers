import java.util.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        // statck
        
        Stack<Integer> arr = new Stack<>();
        
        for (int el : ingredient) {
            arr.push(el);
            
            if (arr.size() >= 4) {
                if (arr.get(arr.size() - 4) == 1 && arr.get(arr.size() - 3) == 2 &&
                   arr.get(arr.size() - 2) == 3 && arr.get(arr.size() - 1) == 1) {
                    answer++;
                    for (int i = 0; i < 4; i++) {
                        arr.pop();
                    }
                }
            }
            
        }
        
        return answer;
    }
}