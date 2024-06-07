class Solution {
    public String solution(String my_string, String alp) {
        String answer = "";
        String alpUpper = alp.toUpperCase();
        
        answer = my_string.replaceAll(alp, alpUpper);
        
        return answer;
    }
}