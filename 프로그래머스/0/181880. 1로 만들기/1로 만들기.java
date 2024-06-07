class Solution {
    public int solution(int[] num_list) {
        int len = num_list.length;
        int count = 0;
        
        for (int i = 0; i < len; i++) {
            while (true) {
                if (num_list[i] == 1) {
                    break;
                }
            
                if (num_list[i] % 2 == 0) {
                    num_list[i] /= 2;
                } else if (num_list[i] % 2 == 1) {
                    num_list[i] = (num_list[i] - 1) / 2;
                }
                
                count++;
                
            }
        }
        
        return count;
    }
}