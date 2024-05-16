import java.util.ArrayList;

class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        
        ArrayList<String> arr = new ArrayList<>();        
        int len = my_string.length();
        
        for (int i = 0; i < len; i += m) {
            arr.add(my_string.substring(i, i + m));
        }       
        
        for (String str : arr) {
            answer += str.substring(c - 1, c);
        }
        
        return answer;
    }
}