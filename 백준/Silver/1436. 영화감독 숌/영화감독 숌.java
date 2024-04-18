import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner i = new Scanner(System.in);

        int N = i.nextInt();

        int num = 666;
        int count = 1;

        while(count != N) {
            num++;

            if (String.valueOf(num).contains("666")) {
                count++;
            }
        }

        System.out.println(num);
    }
}