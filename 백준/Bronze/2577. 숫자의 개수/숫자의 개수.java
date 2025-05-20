
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a*b*c;
        String[] nums={"0","1","2","3","4","5","6","7","8","9"};
        String[] arr = (""+result).split("");
        // List<String> list = Arrays.asList(arr);
        Map<String,Integer> map = new HashMap<>();
        for(String s : nums) {
        	map.put(s, 0);
        }
        for(String s : arr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        map.forEach((k,v)->System.out.println(v));
    }// main
}// class