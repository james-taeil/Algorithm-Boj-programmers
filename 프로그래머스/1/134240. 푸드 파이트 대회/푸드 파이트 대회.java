class Solution {
    public String solution(int[] food) {
        String answer = "";
        int len = food.length;
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < len; i++) {
            count = food[i] / 2;
            
            sb.append(String.valueOf(i).repeat(count));
        }
        
        answer = sb + "0";
        
        answer += sb.reverse();
        
        return answer;
    }
}