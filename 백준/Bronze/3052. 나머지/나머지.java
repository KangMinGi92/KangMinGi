import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner sc = new Scanner(System.in);
       HashSet<Integer> set = new HashSet<>();
       for (int s = 0; s < 10; s++) {
           int a = sc.nextInt();
           int b = a%42;
            set.add(b);
       }
       System.out.println(set.size());
       
    }//main
}