package week3day2;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {


		int[] num= {1,2,3,5,6,7,9};

		Set<Integer> set=new TreeSet<Integer>();

		for (int i = 0; i < num.length; i++) {

			set.add(num[i]);	
		}

		for (int i = 1; i <= 10; i++) {

			if(set.contains(i)) {

			}else {
				
				System.out.println(i);
			}

		}
		System.out.println(set);

	}

}
