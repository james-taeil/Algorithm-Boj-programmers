class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        
        int len = indices.length;
        String[] arr = my_string.split("");
        
        for (int i = 0; i < len; i++) {
            arr[indices[i]] = "";
        }
        
        for (String el : arr) {
            answer += el;
        }
        
        return answer;
    }
}