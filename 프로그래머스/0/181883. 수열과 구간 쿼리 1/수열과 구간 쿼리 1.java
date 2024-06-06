class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = {};
        
        int len = queries.length;
        
        for (int i = 0; i < len; i++) {
            for (int j = queries[i][0]; j <= queries[i][1]; j++) {
                arr[j] += 1;
            }
        }
        
        answer = arr;
        
        return answer;
    }
}