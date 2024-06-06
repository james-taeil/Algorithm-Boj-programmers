import java.util.ArrayList;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList();
        
        int len = todo_list.length;
        
        for (int i = 0; i < len; i++) {
            if (!finished[i]) {
                arr.add(todo_list[i]);
            }    
        }
        
        answer = arr.stream().toArray(String[] :: new);
        
        return answer;
    }
}