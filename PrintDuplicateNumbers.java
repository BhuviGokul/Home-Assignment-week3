package week3day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicateNumbers {

	public static void main(String[] args) {

		int[] data = {4,3,6,8,2,9,1,2,4,7,8};

		Set<Integer> set=new HashSet<Integer>();

		for (int i = 0; i < data.length; i++) {

			boolean dup=set.add(data[i]);
			
			if(dup==false){

				System.out.println(data[i]);
			}
		}
		

		}	
	}



