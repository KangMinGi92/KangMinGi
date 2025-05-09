import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		double d = 0;
		switch (str) {
		case "A+":
			d = 4.3;
			break;
		case "A0":
			d = 4.0;
			break;
		case "A-":
			d = 3.7;
			break;
		case "B+":
			d = 3.3;
			break;
		case "B0":
			d = 3.0;
			break;
		case "B-":
			d = 2.7;
			break;
		case "C+":
			d = 2.3;
			break;
		case "C0":
			d = 2.0;
			break;
		case "C-":
			d = 1.7;
			break;
		case "D+":
			d = 1.3;
			break;
		case "D0":
			d = 1.0;
			break;
		case "D-":
			d = 0.7;
			break;
		default:
			d = 0.0;
		}
		bw.write(String.valueOf(d));
		bw.flush();
		bw.close();
	}// main
}// class