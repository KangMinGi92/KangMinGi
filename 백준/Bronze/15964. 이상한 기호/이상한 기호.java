import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str =br.readLine();
		String[] arr = str.split(" ");
		long a = Long.parseLong(arr[0]);
		long b = Long.parseLong(arr[1]);
		long c = test(a,b);
		bw.write(c+"");
		bw.flush();
		bw.close();
	}// main
	
	public static long test(long a, long b) {
		return (a+b)*(a-b);
	}
}// class