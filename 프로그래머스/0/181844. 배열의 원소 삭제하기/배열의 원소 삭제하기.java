import java.util.*;

class Solution {
    public List solution(int[] arr, int[] delete_list) {
        List<Integer> answer = new ArrayList<>();
        
        for (int el : arr) {
            answer.add(el);
        }
        
        for (int del : delete_list) {
            answer.remove(Integer.valueOf(del));
        }
        
        return answer;
    }
}