import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Stack<Integer> stack = new Stack<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            String command = st.nextToken();

            if (command.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }

            if (command.equals("pop")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(stack.pop() + "\n");
                }
            }

            if (command.equals("size")) {
                sb.append(stack.size() + "\n");
            }

            if (command.equals("empty")) {
                boolean empty = stack.empty();
                if (empty == true) {
                    sb.append(1 + "\n");
                }
                else {
                    sb.append(0 + "\n");
                }
            }

            if (command.equals("top")) {
                if (stack.isEmpty()) {
                    sb.append(-1 + "\n");
                }
                else {
                    sb.append(stack.peek() + "\n");
                }
            }
        }
        System.out.println(sb);
        br.close();
    }
}