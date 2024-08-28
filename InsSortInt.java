import java.io.File;
import java.util.Scanner;

public class InsSortInt {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("randInts.txt"));
		int[] vals = new int[1000];
		for(int i = 0; i < 1000; i++) {
			vals[i] = sc.nextInt();
		}
		
		for(int i = 1; i < 1000; i++) {
			int key = vals[i];
			int j = i - 1;
			while(j>=0 && vals[j] > key) {
				vals[j+1] = vals[j];
				j -=1;
			}
			vals[j+1] = key;
		}
		
		System.out.println("Smallest: "+ vals[0] + " Largest: " + vals[999]);
		sc.close();
	}

}
