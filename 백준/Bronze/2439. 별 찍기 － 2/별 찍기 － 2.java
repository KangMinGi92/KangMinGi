import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine());
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=a-i;j++) {
				System.out.print(" ");
			}
			for(int l=1;l<=i;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// main

}// class