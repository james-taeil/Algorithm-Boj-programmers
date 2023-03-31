import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String reg = "^[0-9A-Z\\$%*+-./:]{1,20}$";

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();
            String ans = "";

            if (!(Pattern.matches(reg, S))) break;

            for (int j = 0; j < S.length(); j++) {
                for (int k = 0; k < R; k++) {
                    ans += S.charAt(j);
                }
            }
            System.out.println(ans);
        }
    }
}