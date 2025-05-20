
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for(int i=0;i<a;i++){
            int b = sc.nextInt();
            String[] arr = new String[b];   
            arr = sc.next().split("");
            for(int j = 0 ; j<arr.length;j++){
                for(int k=0; k<b; k++){
                    System.out.print(arr[j]);
                }
            }
            System.out.println();
        }
    }// main
}// class