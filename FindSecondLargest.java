package week3day2;


import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {


		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		
		Set<Integer> set=new TreeSet<Integer>();
		
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i < data.length; i++) {
			
			set.add(data[i]);
		}
		
		list.addAll(set);
		int maxv=list.size()-1;
		int result=maxv-1;
		
		System.out.println(list.get(result));
		
	}

}
