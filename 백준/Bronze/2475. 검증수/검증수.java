import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();
		String[] arr = line.split(" ");
		Integer[] a = new Integer[arr.length];
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			a[i]=Integer.parseInt(arr[i]);
		}
		for(Integer n : a) {
			sum+=n*n;
		}
		int result=sum%10;
		bw.write(result+"");
		bw.flush();
		bw.close();
	}// main

}// class