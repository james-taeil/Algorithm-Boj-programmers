import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] queue1, int[] queue2) {
        int answer = 0;

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();

        long sumQ1 = Arrays.stream(queue1).sum();
        long sumQ2 = Arrays.stream(queue2).sum();
        long result = sumQ2 + sumQ1;
        long half = result / 2;

        if (result % 2 != 0) {
            return -1;
        }

        for (int i = 0; i < queue1.length; i++) {
            q1.add(queue1[i]);
            q2.add(queue2[i]);
        }

        int temp = 0;

        while (sumQ1 != half) {
            if (sumQ1 < half) {
                temp = q2.poll();
                q1.add(temp);
                sumQ1 += temp;
            }
            else {
                temp = q1.poll();
                q2.add(temp);
                sumQ1 -= temp;
            }
            answer++;

            if (answer > (queue1.length * 2) * 2) {
                return -1;
            }
        }

        return answer;
    }
}