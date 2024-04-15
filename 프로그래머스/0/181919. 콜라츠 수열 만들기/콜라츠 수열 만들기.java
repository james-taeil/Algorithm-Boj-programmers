import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> answer = new ArrayList<>();
        
        // 연산
        // if (n % 2 == 0) {
        //     answer.add(n);
        // }
        
        answer.add(n);
        
        while (n != 1) {
            
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 == 1) {
                n = (3 * n) + 1;
            }
            
            answer.add(n);
        }
        
        return answer.stream().mapToInt(Integer :: intValue).toArray();
    }
}