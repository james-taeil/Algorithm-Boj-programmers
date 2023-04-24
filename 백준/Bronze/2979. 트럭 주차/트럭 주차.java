import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[][] arr = new int[3][2];
        int max = 0;
        int sum = 0;

        int A = Integer.parseInt(st.nextToken()); 
        int B = Integer.parseInt(st.nextToken()); 
        int C = Integer.parseInt(st.nextToken()); 

        for (int i = 0; i < 3; i++) {
            // input
            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            int[] tempArr = {start, end};
            arr[i] = tempArr;
            max = Math.max(max, end);
        }

        int[] maxBoard = new int[max - 1];

        for (int[] el : arr) {
            for (int i = el[0] - 1; i < el[1] - 1; i++) {
                maxBoard[i] += 1;
            }
        }

        for (int el : maxBoard) {
            if (el == 1) {
                sum += A * el;
            }
            else if (el == 2) {
                sum += B * el;
            }
            else if (el == 3) {
                sum += C * el;
            }
        }
        System.out.println(sum);
        bf.close();


    }
}