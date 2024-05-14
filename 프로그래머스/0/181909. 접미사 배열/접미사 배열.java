import java.util.Arrays;

class Solution {
    public String[] solution(String my_string) {
        int len = my_string.length();
        String[] arr = new String[len]; 
        
        for (int i = 0; i < len; i++) {
            arr[i] = my_string.substring(i, len);
        }

        Arrays.sort(arr);
        return arr;
    }
}