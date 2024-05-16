class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        
        int len = code.length();
        
        for (int i = 0; i < len; i++) {
            if (i % q == r) {
                answer += code.substring(i, i + 1);
            }
        }
        
        return answer;
    }
}