import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        List<Integer> arr = new ArrayList<>();
        int len = num_list.length;
        
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        
        if (n == 1) {
            for (int i = 0; i <= b; i++) {
                arr.add(num_list[i]);
            }
        } else if (n == 2) {
            for (int i = a; i < len; i++) {
                arr.add(num_list[i]);
            }
        } else if (n == 3) {
            for (int i = a; i <= b; i++) {
                arr.add(num_list[i]);
            }
        } else if (n == 4) {
            for (int i = a; i <= b; i += c) {
                arr.add(num_list[i]);
            }
        }
        
        answer = arr.stream().mapToInt(x -> x).toArray();
        
        return answer;
    }
}