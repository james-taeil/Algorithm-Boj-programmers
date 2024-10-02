class Solution {
    public String solution(String X, String Y) {
        StringBuilder answer = new StringBuilder();
        
        int[] arrX = new int[10];
        int[] arrY = new int[10];
        
        for (String x : X.split("")) {
            arrX[Integer.parseInt(x)]++;
        }
        
        for (String y : Y.split("")) {
            arrY[Integer.parseInt(y)]++;
        }
        
        for (int i = 9; i >= 0; i--) {
            while(arrX[i] > 0 && arrY[i] > 0) {
                answer.append(i);
                
                arrX[i]--;
                arrY[i]--;
            }
        }
        
        if ("".equals(answer.toString())) {
            return "-1";
        }
        
        if ("0".equals(answer.toString().substring(0, 1))) {
            return "0";
        }
        
        return answer.toString();
    }
}