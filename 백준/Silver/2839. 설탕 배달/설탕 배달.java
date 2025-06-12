import java.io.IOException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
        int n5 = 0;
        int n3 = 0;
        int result = -1;

        // 잘못된 로직도 수정해야 합니다
        // 아래는 간단한 예시로 3과 5의 최소 봉지 수 구하는 백준 2839 풀이

        while (n >= 0) {
            if (n % 5 == 0) {
                result = n / 5 + n3;
                break;
            }
            n -= 3;
            n3++;
        }

        System.out.println(result);
    }
}