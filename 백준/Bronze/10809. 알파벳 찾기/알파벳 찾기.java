import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.next().split("");
        List<Integer> list = new ArrayList<>();
        for(int a=97;a<=122;a++){
            boolean flag = false;
            for(int i=0;i<arr.length;i++){
                if(arr[i].charAt(0)==a){
                    list.add(i);
                    flag = true;
                    break;
                }
            }
            if(!flag)
            list.add(-1);
        }
        list.stream().forEach(e->System.out.print(e+" "));
    }
}