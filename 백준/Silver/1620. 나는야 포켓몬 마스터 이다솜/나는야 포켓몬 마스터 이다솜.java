import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, String> poketmons = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1; i < N + 1; i++) {
            String poketmonName = br.readLine();
            String num = Integer.toString(i);

            poketmons.put(num, poketmonName); 
            poketmons.put(poketmonName, num); 
        }

        for (int i = 0; i < M; i++) {
            sb.append(poketmons.get(br.readLine()));
            sb.append('\n');
        }
        System.out.println(sb);

    }
}