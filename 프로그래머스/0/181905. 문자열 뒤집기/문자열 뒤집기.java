class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        String slice = my_string.substring(s, e + 1);
        int len = slice.length();
        String reverse = "";
        
        System.out.println(slice);
        
        for (int i = len - 1; i >= 0; i--) {
            reverse += slice.charAt(i);
        }
        
        
        answer = my_string.substring(0, s) + reverse + my_string.substring(e + 1);
        
        
        return answer;
    }
}