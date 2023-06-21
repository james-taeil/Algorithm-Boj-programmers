import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> basket = new Stack<>();
        int doll = 0;

        for (int move : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][move - 1] != 0) {
                    if (!basket.empty() && basket.peek() == board[j][move - 1]) {
                        basket.pop();
                        answer += 2;
                    }
                    else {
                        doll = board[j][move - 1];
                        basket.push(doll);
                    }
                    board[j][move - 1] = 0;
                    break;
                }
            }
        }
        return answer;
    }
}