import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean flag = true;
        while (flag) {
            String[] arr = br.readLine().split(" ");
            if (arr[0].equals("0")) {
                flag = false;
            } else {
                Integer[] iarr = new Integer[arr.length];
                for (int i = 0; i < arr.length; i++) {
                    iarr[i] = Integer.valueOf(arr[i]);
                }
				Arrays.sort(iarr);
                boolean con = test(iarr[0], iarr[1], iarr[2]);
                if (con) {
                    bw.write("right\n");
                } else {
                    bw.write("wrong\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }// main

    private static boolean test(int a, int b, int c) {
        boolean flag = (a * a) + (b * b) == (c * c);
        return flag;
    }
}// class