class Solution {
    public int solution(int num, int k) {
        
        String numString = Integer.toString(num);
        String countK = Integer.toString(k);
        
        if (numString.indexOf(countK) == -1) return -1;
        else return numString.indexOf(countK) + 1;
                
    }
}