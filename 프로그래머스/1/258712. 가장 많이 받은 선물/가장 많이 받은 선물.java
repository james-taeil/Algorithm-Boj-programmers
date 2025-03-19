import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        int answer = 0;
        int len = friends.length;
        HashMap<String, Integer> map = new HashMap<>();
        int[] giftDegree = new int[len];
        int[][] matrix = new int[len][len];
        int[] nextMonthGifts = new int[len];

        for (int i = 0; i < len; i++) {
            map.put(friends[i], i);
        }

        for (String gift : gifts) {
            String[] parts = gift.split(" ");
            giftDegree[map.get(parts[0])]++;
            giftDegree[map.get(parts[1])]--;
            matrix[map.get(parts[0])][map.get(parts[1])]++;
        }
        
        for (int i = 0; i < len; i++) {
            int num = 0;
            for (int j = 0; j < len; j++) {
                if (i == j) {
                    continue;
                }

                if (matrix[i][j] > matrix[j][i] || (matrix[i][j] == matrix[j][i] && giftDegree[i] > giftDegree[j])) {
                    num++;
                }
            }
            if (answer < num) {
                answer = num;
            }
        }

        return answer;
    }
}