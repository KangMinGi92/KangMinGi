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
		String[] arr = new String[a];
		arr = br.readLine().split("");
		int sum = 0;
		for (String s : arr) {
			sum += Integer.parseInt(s);
		}
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}// main

}// class