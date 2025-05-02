import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력이 끝날 때까지 계속 읽기
        while (scanner.hasNextInt()) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();

            // 조건: 0 < A, B < 10
            if (A > 0 && B > 0 && A < 10 && B < 10) {
                System.out.println(A + B);
            }
        }

        scanner.close();
    }
}