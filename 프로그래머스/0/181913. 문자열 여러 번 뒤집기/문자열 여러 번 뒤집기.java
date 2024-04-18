class Solution {
    public String solution(String my_string, int[][] queries) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder(my_string);
        
        for (int i = 0; i < queries.length; i++) {
            String temp = sb.substring(queries[i][0], queries[i][1] + 1);
            
            StringBuilder subSb = new StringBuilder(temp);
            
            subSb.reverse();
            
            sb.replace(queries[i][0], queries[i][1] + 1, subSb.toString());
        }
        
        answer = sb.toString();
        
        return answer;
    }
}