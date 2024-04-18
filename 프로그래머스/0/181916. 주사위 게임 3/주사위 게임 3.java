import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        
        // sort
        // equals dice 4
        // equals dice 3 a == c || b == d
        // equals dice 2 a == c && b == d
        // other equals dice 2
        // a == b
        // b == c
        // c == d
        // else
        
        int[] dice = {a, b, c, d};
        
        Arrays.sort(dice);
        
        if (dice[0] == dice[3]) {
            answer = 1111 * a;
        } 
        else if (dice[0] == dice[2] || dice[1] == dice[3]) {
            answer = (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
        } 
        else if (dice[0] == dice[1] && dice[2] == dice[3]) {
            answer = (dice[0] + dice[3]) * (dice[3] - dice[0]);
        } 
        else if (dice[0] == dice[1]) {
            answer = dice[2] * dice[3];
        } 
        else if (dice[1] == dice[2]) {
            answer = dice[0] * dice[3];
        } 
        else if (dice[2] == dice[3]) {
            answer = dice[0] * dice[1];
        } 
        else {
            answer = dice[0];
        }
        
        return answer;
    }
}