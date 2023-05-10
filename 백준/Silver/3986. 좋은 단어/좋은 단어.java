import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main  {
    public static void main(String[] args) throws IOException {
        Stack<Character> stack = new Stack<Character>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                
                char idxStr =  str.charAt(j);
                if (!stack.isEmpty() && stack.peek().equals(idxStr)) {
                    stack.pop();
                }
                else {
                    stack.push(str.charAt(j));
                }
            }
            if (stack.isEmpty()) count++;
            stack.clear();
        }

        System.out.println(count);
        br.close();
    }
}