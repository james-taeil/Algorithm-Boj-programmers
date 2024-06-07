import java.util.ArrayList;

class Solution {
    public String[] solution(String[] strArr) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList();
        int len = strArr.length;
        
        for (int i = 0; i < len; i++) {
            if (!strArr[i].contains("ad")) {
                arr.add(strArr[i]);
            }
        }
        
        answer = arr.stream().toArray(String[] :: new);
        
        return answer;
    }
}