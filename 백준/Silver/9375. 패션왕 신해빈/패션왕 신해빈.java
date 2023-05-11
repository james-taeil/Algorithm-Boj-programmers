import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        int N = 0;
        HashMap<String, Integer> map;
        String type;

        for (int i = 0; i < testCase; i++) {
            N = Integer.parseInt(br.readLine());
            map = new HashMap<String, Integer>();

            for (int j = 0; j < N; j++) {
                String str= br.readLine();
                String[] strArr = str.split(" ");

                Integer val = map.get(strArr[1]);

                if (val == null) {
                    val = 1;
                } else {
                    val += 1;
                }

                map.put(strArr[1], val);
            }

            int result = 1;

            for (String v : map.keySet()) {
                result *= map.get(v) + 1;
            }

            result -= 1;
            System.out.println(result);
        }
        br.close();
    }
}