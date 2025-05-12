import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.valueOf(br.readLine());
		for(int i=0; i<a; i++) {
			String str = br.readLine();
			char first = str.charAt(0);
			char last = str.charAt(str.length()-1);
			bw.write(first);
			bw.write(last+"\n");
		}
		bw.flush();
		bw.close();
	}// main
}// class