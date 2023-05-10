class Solution {
    public String solution(String s) {
        String answer = "";
        int strLength = s.length();
        
        if (strLength % 2 == 0) {
            answer += s.substring((strLength / 2 - 1), (strLength / 2 + 1));
        } else {
            answer += s.substring((strLength / 2), (strLength / 2 + 1));
        }
        
        return answer;
    }
}