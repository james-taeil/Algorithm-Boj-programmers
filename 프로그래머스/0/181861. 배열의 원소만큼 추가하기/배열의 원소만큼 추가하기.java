import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        ArrayList<Integer> list = new ArrayList<>();
        int len = arr.length;
        int elLen = 0;
        for (int i = 0; i < len; i++) {
            elLen = arr[i];
            
            for (int y = 0; y < elLen; y++) {
                list.add(elLen);
            }
        }
        
        answer = list.stream().mapToInt(Integer :: intValue).toArray();
        
        return answer;
    }
}