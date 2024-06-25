import java.util.Arrays;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        int[] arr = new int[100000];
        int len = strArr.length;
        
        for (int i = 0; i < len; i++) {
            arr[strArr[i].length()]++;
        }
        answer = Arrays.stream(arr).max().getAsInt();
        
        return answer;
    }
}