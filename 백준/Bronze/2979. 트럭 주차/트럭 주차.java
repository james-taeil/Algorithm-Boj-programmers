import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[100];

        int start, end, max = 0;
        int min = 1000;

        int sum = 0;

        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());

            min = Math.min(min, start);
            max = Math.max(max, end);

            for (int j = start; j < end; j++) {
                arr[j]++;
            }
        }

        for (int i = min; i < max; i++) {
            if (arr[i] == 1) {
                sum += arr[i] * a;
            } else if (arr[i] == 2) {
                sum += arr[i] * b;
            } else if (arr[i] == 3) {
                sum += arr[i] * c;
            }
        }

        System.out.println(sum);
    }
}
