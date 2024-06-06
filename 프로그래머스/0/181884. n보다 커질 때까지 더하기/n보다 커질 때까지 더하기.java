class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        int sum = 0;
        int len = numbers.length;
        
        for (int i = 0; i < len; i++) {
            sum += numbers[i];
            
            if (sum > n) {
                break;
            }
        }
        answer = sum;
        
        return answer;
    }
}