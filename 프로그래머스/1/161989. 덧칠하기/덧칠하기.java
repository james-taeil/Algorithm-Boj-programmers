class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        
        // 구현
        
        int len = section.length;
        int roller = 1;
        
        for (int i = 0; i < len; i++) {
            if (section[i] >= roller) {
                answer++;
                roller = section[i] + m;
            }
        }
        
        return answer;
    }
}