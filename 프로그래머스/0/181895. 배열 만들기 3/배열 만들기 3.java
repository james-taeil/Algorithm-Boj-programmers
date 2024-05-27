import java.util.List;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] answer;
        
        List<Integer> arrTemp = new ArrayList();
        int len = intervals.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = intervals[i][0]; j <= intervals[i][1]; j++) {
                arrTemp.add(arr[j]);
            }
        }
        
        int listLen = arrTemp.size();
        answer = new int[listLen];
        
        for (int k = 0; k < listLen; k++) {
            answer[k] = arrTemp.get(k);
        }
        
        return answer;
    }
}