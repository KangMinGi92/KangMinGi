import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] arr = br.readLine().split(" ");
        int a = arr.length;
        for(int i=0;i<arr.length;i++) {
        	if(arr[0].equals("")){
        		a--;
        		break;
        	}
        }
        bw.write(a+"");
        bw.flush();
        bw.close();
    }// main
}// class