import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static boolean[][] arr;
    public static int count = 64;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new boolean[N][M];

        // 배열 정리
        for (int i = 0; i < N; i++) {

            String str = br.readLine();

            for (int j = 0; j < M; j++) {
                if (str.charAt(j) == 'W') {
                    arr[i][j] = true;
                } else {
                    arr[i][j] = false;
                }
            }
        }

        int NRow = N - 7;
        int MCol = M - 7;

        for (int i = 0; i < NRow; i++) {
            for(int j = 0; j < MCol; j++) {
                find(i, j);
            }
        }

        System.out.println(count);
    }

    public static void find(int x, int y) {

        int endX = x + 8;
        int endY = y + 8;
        int cnt = 0;

        boolean COLOR = arr[x][y];

        for (int i = x; i < endX; i++) {
            for (int j = y; j < endY; j++) {

                if (arr[i][j] != COLOR) {
                    cnt++;
                }

                COLOR = !COLOR;
            }

            COLOR = !COLOR;
        }

        cnt = Math.min(cnt, 64 - cnt);

        count = Math.min(count, cnt);
    }
}