import java.util.ArrayList;

class Solution {
    public String[] solution(String myStr) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();        
        String str = myStr.replace("a", " ").replace("b", " ").replace("c", " ");
        
        String[] list = str.split(" ");
        
        for (String el : list) {
            if (!el.equals("")) {
                arr.add(el);
            }
        }
        
        if (arr.size() == 0) {
            arr.add("EMPTY");
        }
        
        answer = arr.stream().toArray(String[] :: new);
        
        return answer;
    }
}