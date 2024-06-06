class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            if (50 > arr[i] && arr[i] % 2 == 1) {
                arr[i] = arr[i] * 2;
            } else if (50 <= arr[i] && arr[i] % 2 == 0) {
                arr[i] = arr[i] / 2;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}