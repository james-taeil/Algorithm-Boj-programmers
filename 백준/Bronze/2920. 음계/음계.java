import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[8];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < 8; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        if (arr[0] == 1) {
            for (int j = 1; j < 7; j++) {
                if (arr[j + 1] != arr[j] + 1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("ascending");
        }
        else if (arr[0] == 8) {
            for (int j = 1; j < 7; j++) {
                if (arr[j + 1] != arr[j] - 1) {
                    System.out.println("mixed");
                    return;
                }
            }
            System.out.println("descending");
        }

        else if (arr[0] != 1 || arr[0] != 8) {
            System.out.println("mixed");
        }
    }
}