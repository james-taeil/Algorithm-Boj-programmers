import java.util.ArrayList;

class Solution {
    public String[] solution(String[] names) {
        int len = names.length;
        String[] answer = {};
        ArrayList<String> arr = new ArrayList();
        
        for (int i = 0; i < len; i += 5) {
            arr.add(names[i]);
        }
        
        answer = arr.stream().toArray(String[] :: new);
        
        return answer;
    }
}