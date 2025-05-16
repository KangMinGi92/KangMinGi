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
            int hour = Integer.parseInt(arr[0]);
            int minute = Integer.parseInt(arr[1]);
            if(hour>0 && minute>=45){
                minute-=45;
            }else if(hour>0 && minute<45){
                hour-=1;
                minute=(60+minute-45)%60;
            }else if(hour==0 && minute>=45){
                minute-=45;
            }else if(hour==0 && minute<45){
                hour=23;
                minute=(60+minute-45)%60;
            }
           
            bw.write(hour+" "+minute);
            bw.flush();
            bw.close();
    }// main
}// class