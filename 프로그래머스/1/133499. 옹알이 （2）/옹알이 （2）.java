class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        int len = babbling.length;
        
        for (int i = 0; i < len; i++) {
            babbling[i] = babbling[i].replace("ayaaya", "1");
            babbling[i] = babbling[i].replace("yeye", "1");
            babbling[i] = babbling[i].replace("woowoo", "1");
            babbling[i] = babbling[i].replace("mama", "1");
            
            
            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            
            babbling[i] = babbling[i].replace(" ","");
            
            if(babbling[i].length() == 0){
                answer++;
            }
        }
        
        return answer;
    }
}