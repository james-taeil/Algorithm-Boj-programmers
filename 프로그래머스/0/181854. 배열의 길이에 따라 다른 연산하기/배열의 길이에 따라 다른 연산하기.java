class Solution {
    public int[] solution(int[] arr, int n) {
        int[] answer = {};
        
        int len = arr.length;
        answer = new int[len];
        
        if (len % 2 == 0) {
            for (int i = 1; i < len; i+=2) {
                arr[i] = arr[i] + n;
            }
        } else if (len % 2 == 1) {
            for (int i = 0; i < len; i+=2) {
                arr[i] = arr[i] + n;
            }
        }
        
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}