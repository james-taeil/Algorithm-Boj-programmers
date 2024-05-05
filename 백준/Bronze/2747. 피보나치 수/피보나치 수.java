import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N + 1];

        for (int i = 0; i < N + 1; i++) {
            dp[i] = -1;
        }

        dp[0] = 0;
        dp[1] = 1;

        for (int j = 2; j < N + 1; j++) {
            dp[j] = dp[j - 1] + dp[j - 2];
        }
        System.out.println(dp[N]);
    }
}