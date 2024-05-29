import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int[] answer = {};
        
        // 배열
        // index로 자르기
        
        int qLen = query.length;
        
        for (int i = 0; i < qLen; i++) {
            if (i % 2 == 0) {
                arr = Arrays.copyOfRange(arr, 0, query[i] + 1);
            } else if (i % 2 != 0) {
                arr = Arrays.copyOfRange(arr, query[i], arr.length);
            }
        }
        
        int len = arr.length;
        answer = new int[len];
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
    
        return answer;
    }
}