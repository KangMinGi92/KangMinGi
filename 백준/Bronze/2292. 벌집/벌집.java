
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        //1 7 19 37 61 91 127
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int count = 1;
        int result = 1;
        while (target > result) {
            result += 6 * count;
            count++;
        }
        System.out.println(count);
    }
}
