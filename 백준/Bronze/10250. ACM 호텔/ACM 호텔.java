
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int a = 0;
        int b = 0;
        for (int i = 0; i < t; i++) {
            int h = sc.nextInt();
            int w = sc.nextInt();
            int n = sc.nextInt();
            if (n % h != 0) {
                a = n % h * 100; //층수
                b = n / h + 1; //호수
            } else {
                a = h * 100;
                b = n / h;
            }
            System.out.println(a + b);
        }
    }// main
}// class
