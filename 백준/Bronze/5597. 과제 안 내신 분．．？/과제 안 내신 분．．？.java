import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new HashSet<>();
		List<Integer> list = new ArrayList<>();
		for(int i=0; i<28; i++) {
			set.add(sc.nextInt());
		}
		for(int j=1; j<=30; j++) {
			if(!set.contains(j))
				list.add(j);
		}
		
		list.sort(null);
		for(Integer s : list) {
			System.out.println(s);
		}
	}// main
}// class	