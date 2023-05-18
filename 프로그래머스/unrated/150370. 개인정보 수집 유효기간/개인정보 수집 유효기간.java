import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        int days = getDay(today);

        // terms
        for (String term : terms) {
            map.put(term.split(" ")[0], Integer.parseInt(term.split(" ")[1]));
        }

        // privacies
        for (int i = 0; i < privacies.length; i++) {
            int day = getDay(privacies[i].split(" ")[0]);
            int privacy = day + (map.get(privacies[i].split(" ")[1]) * 28);
            
            if (days >= privacy) {
                answer.add(i + 1);
            }
        }
        return answer.stream().mapToInt(el -> el).toArray();
    }
    
    static int getDay(String data) {
        String[] today = data.split("\\.");
        int year = Integer.parseInt(today[0]);
        int month = Integer.parseInt(today[1]);
        int day = Integer.parseInt(today[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}