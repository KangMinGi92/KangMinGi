import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 9; i++) {
                list.add(Integer.parseInt(br.readLine()));
            }

            int maxValue = list.stream().max(Comparator.naturalOrder()).get();
            int index = list.indexOf(maxValue)+1;

            bw.write(maxValue + "\n");
            bw.write(index + "\n");
        }
    }// main
}// class