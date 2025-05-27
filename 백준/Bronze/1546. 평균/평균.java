
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        List<Integer> list = new ArrayList<>();
        double sum=0;
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        for (int j = 0; j < list.size(); j++) {
            if (list.get(j) > max) {
                max = list.get(j);
            }
        }
        for(int k=0; k<list.size();k++){
            sum+=(double)list.get(k)/max*100;
        }
        System.out.println(sum/list.size());
    }
}
