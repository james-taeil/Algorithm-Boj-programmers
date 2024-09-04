class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        int count;
        
        for (int num = 1; num <= number; num++) {
            count = 0;
            
            for (int i = 1; i * i <= num; i++) {

                if (i * i == num) {
                    count++;
                } else if (num % i == 0) {
                    count += 2;
                }
            }
            
            answer += count > limit ? power : count;
        }
        
        return answer;
    }
}