import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        int[] answer = new int[n / k];
        int len = n / k;
        
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                arr.add(i);
            }
        }
        
        
        
        for (int j = 0; j < len; j++) {
            answer[j] = arr.get(j).intValue();
        }
        
        return answer;
    }
}