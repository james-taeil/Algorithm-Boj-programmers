class Solution {
    public int solution(String s) {
        int answer = 1;
        int len = s.length();
        
        char c = s.charAt(0);
        int count = 1;
        
        for (int i = 1; i < len; i++) {
            char str = s.charAt(i);

            if (count == 0) {
                answer++;
                c = str;
            }
            
            if (c == str) {
                count++;
            } else {
                count--;
            }
        }
                
        
        return answer;
    }
}