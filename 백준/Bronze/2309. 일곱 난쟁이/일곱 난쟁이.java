import java.io.*;
import java.util.*;


public class Main {
    static List<Integer> arr = new ArrayList<>();
    static int sum = 0;
    static int faker1 = 0;
    static int faker2 = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 9; i++) {
            arr.add(Integer.parseInt(bf.readLine()));
            sum += arr.get(i);
            
        }

        Collections.sort(arr); 

        for (int i = 0; i < 9; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr.get(i) - arr.get(j) == 100) {
                    faker1 = arr.get(i);
                    faker2 = arr.get(j);
                    break;
                }
            }
        }

        for (int el : arr) {
            if (!(el == faker1 || el == faker2)) {
                System.out.println(el);
            }
        }
        
    }
}