import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = {};
        
        List<Integer> list = new ArrayList<>();
        int len = arr.length;
        
        for (int i = 0; i < len; i++) {
            if (list.size() == k) {
                break;
            } else if (!list.contains(arr[i])) {
                list.add(arr[i]);
            }
        }
        
        while (list.size() != k) {
            list.add(-1);
        }
        
        answer = list.stream().mapToInt(el -> el).toArray();
        
        return answer;
    }
}