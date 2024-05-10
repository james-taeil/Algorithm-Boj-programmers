class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        for (int i = 0; i < parts.length; i++) {
            
        }StringBuffer sb = new StringBuffer();

        for (int i = 0; i < parts.length; i++) {
            sb.append(my_strings[i].substring(parts[i][0], parts[i][1] + 1));
        }

        System.out.println(sb);
        answer = sb.toString();
        
        return answer;
    }
}