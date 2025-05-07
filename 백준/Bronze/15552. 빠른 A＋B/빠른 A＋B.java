import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // 빠른 입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 빠른 출력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] parts = br.readLine().split(" ");
            int A = Integer.parseInt(parts[0]);
            int B = Integer.parseInt(parts[1]);
            bw.write((A + B) + "\n");
        }

        // 출력 버퍼 비우기
        bw.flush();
        bw.close();
        br.close();
    }
}