class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;
        int sLen = myString.length();
        int pLen = pat.length();
        int count = 0;
        
        for (int i = 0; i < sLen - pLen + 1; i++) {
            if (myString.substring(i, i + pLen).contains(pat)) {
                count++;
            }
        }
        
        answer = count;
        
        return answer;
    }
}