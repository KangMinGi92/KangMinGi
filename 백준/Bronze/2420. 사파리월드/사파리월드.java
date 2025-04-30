import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextInt();
		long b = sc.nextInt();
		if(-2000000000<=a && a<=2000000000 && -2000000000<=b && b<=2000000000)
		System.out.println(Math.abs(a-b));
		
	}
}