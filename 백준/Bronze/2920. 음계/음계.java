import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        List<String> ascending = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8");
        List<String> descending = Arrays.asList("8", "7", "6", "5", "4", "3", "2", "1");
        List<String> list = Arrays.asList(arr);

        if (ascending.equals(list)) {
            System.out.println("ascending");
        } else if (descending.equals(list)) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }// main
}// class