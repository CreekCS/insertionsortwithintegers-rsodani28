import java.io.File;
import java.util.*;

import java.util.Scanner;

public class InsSortInt {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("randInts.txt"));
		ArrayList<Integer> temp = new ArrayList<Integer>();
		while(sc.hasNextLine()){
			temp.add(Integer.parseInt(sc.nextLine()));
		}
		int[] vals = new int[temp.size()];
		for(int i = 0; i < temp.size(); i++) {
			vals[i] = temp.get(i);
		}
	
		InsSort(vals);
		
		System.out.println("Smallest: "+ vals[0] + " Largest: " + vals[999]);
		sc.close();
	}
	
	public static void InsSort(int[] vals){
		
		for(int i = 1; i < 1000; i++) {
			int key = vals[i];
			int j = i - 1;
			while(j>=0 && vals[j] > key) {
				vals[j+1] = vals[j];
				j -=1;
			}
			vals[j+1] = key;
		}
	}

}
