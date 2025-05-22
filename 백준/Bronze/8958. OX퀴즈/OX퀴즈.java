
import java.io.IOException;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int total = 0;
        int point = 0;
        for (int i = 0; i < a; i++) {
            String[] str = sc.next().split("");
            for (int j = 0; j < str.length; j++) {
                if (str[j].equals("O")) {
                    point += 1;
                    total += point;
                    if (j!=str.length-1&&str[j].equals(str[j + 1])) {
                    }else{
                        point = 0;
                    }
                } else {
                    point = 0;
                }
            }
            System.out.println(total);
            total = 0;
            point = 0;
        }

    }//main
}
