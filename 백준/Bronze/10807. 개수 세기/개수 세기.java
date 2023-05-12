import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int selectNum = Integer.parseInt(br.readLine());

        for (int el : arr) {
            if (selectNum == el) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}