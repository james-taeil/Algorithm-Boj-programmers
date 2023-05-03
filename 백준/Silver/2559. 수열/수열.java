import java.io.*;
import java.util.StringTokenizer;

public class Main {
    
    static int N, K;
    static int[] sequence;
    static int max;

    public static void solution() {
        int temp = 0;
        int start = 0;
        int end = K;

        for (int i = 0; i < K; i++) {
            temp += sequence[i];
        }

        max = temp;

        while (end <= N - 1) {
            temp -= sequence[start++];
            temp += sequence[end++];
            max = Math.max(max, temp);
        }
    }
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        sequence = new int[N];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            sequence[i] = Integer.parseInt(st.nextToken());
        }

        solution();
        System.out.println(max);

        br.close();
    }
}