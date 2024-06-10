class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        
        String[] arr = myString.split("x", -1);
        int len = arr.length;
        answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = arr[i].length();
        }
        
        return answer;
    }
}