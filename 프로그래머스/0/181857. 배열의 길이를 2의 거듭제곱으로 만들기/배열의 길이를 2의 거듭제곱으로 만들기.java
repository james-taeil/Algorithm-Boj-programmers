class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        int target = 1;
        int len = arr.length;
        
        while (target < len) {
            target *= 2;
        }
        
        answer = new int[target];
        
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}