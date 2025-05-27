
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int targetNum = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int q = 0; q < list.size(); q++) {
            for (int w = q + 1; w < list.size(); w++) {
                for (int e = w + 1; e < list.size(); e++) {
                    int sum = list.get(q) + list.get(w) + list.get(e);
                    if (sum <= targetNum && sum > max) {
                        max = sum;
                    }

                }
            }
        }
        System.out.println(max);
    }
}
