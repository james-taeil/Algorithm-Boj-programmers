import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] origin = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> rankingMap = new HashMap<Integer, Integer>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            origin[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 0; i < origin.length; i++) {
            sorted[i] = origin[i];
        }

        Arrays.sort(sorted);

        int rank = 0;

        for (int el : sorted) {

            if (!rankingMap.containsKey(el)) {
                rankingMap.put(el, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int key : origin) {
            int ranking = rankingMap.get(key);

            sb.append(ranking).append(" ");
        }

        System.out.println(sb);
    }
}