import java.util.HashMap;

class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        HashMap<Character, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < choices.length; i++) {
            int val = choices[i];

            if (val > 0 && val < 4) {
                char sur = survey[i].charAt(0);
                map.put(sur, map.getOrDefault(sur, 0) + (4 - val));
            }
            else if (val > 4) {
                char sur = survey[i].charAt(1);
                map.put(sur, map.getOrDefault(sur, 0) + (val - 4));
            }
        }
//        System.out.println(map.get('R') >= map.get('T')); // nullPointerException
        sb.append((map.getOrDefault('R', 0) >= map.getOrDefault('T', 0)) ? 'R' : 'T');
        sb.append((map.getOrDefault('C', 0) >= map.getOrDefault('F', 0)) ? 'C' : 'F');
        sb.append((map.getOrDefault('J', 0) >= map.getOrDefault('M', 0)) ? 'J' : 'M');
        sb.append((map.getOrDefault('A', 0) >= map.getOrDefault('N', 0)) ? 'A' : 'N');
        answer = sb.toString();
        
        return answer;
    }
}