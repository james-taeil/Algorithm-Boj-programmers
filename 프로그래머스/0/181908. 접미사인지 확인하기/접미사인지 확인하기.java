class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        int len = my_string.length();
        
        for (int i = 0; i < len; i++) {
            if (my_string.substring(i, len).equals(is_suffix)) {
                answer = 1;
                break;
            }
        }
        
        return answer;
    }
}