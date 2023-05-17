import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[][] timeTable = new int[n][2];
        int count = 0;
        int time = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
             timeTable[i][0] = Integer.parseInt(st.nextToken());
             timeTable[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(timeTable, (a, b) -> {
           if (a[1] == b[1]) return a[0] - b[0];
           return a[1] - b[1];
        });

        for (int i = 0; i < n; i++) {
            if (timeTable[i][0] >= time) {
                time = timeTable[i][1];
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}