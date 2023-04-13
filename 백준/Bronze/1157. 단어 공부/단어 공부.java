import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toUpperCase();

        int[] counts = new int['Z' - 'A' + 1];
        char[] alpha = new char['Z' - 'A' + 1];

        for (int i = 0; i < alpha.length; i++) {
            alpha[i] = (char)('A' + i);
        }

        for (int i = 0; i < word.length(); i++) {
            counts[word.charAt(i) - 'A']++;
        }
 
        int max = -1; // counts ( >= 0 )
        String popular = "";

        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > max) {
                max = counts[i];
                popular = Character.toString(alpha[i]);
            }
            else if (counts[i] == max) {
                popular = "?";
            }
        }
        System.out.println(popular);

        scanner.close();
    }
}