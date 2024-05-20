class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        
        char[] charArr = my_string.toCharArray();
        
        System.out.print(charArr);
        
        for (char c : charArr) {
            int i = c < 'a' ? c - 65 : c - 71;
            answer[i]++;
        }
        
        return answer;
    }
}