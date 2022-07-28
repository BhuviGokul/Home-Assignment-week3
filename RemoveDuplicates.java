package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		
		String text = "We learn java basics as part of java sessions in java week1";
					
		String[] word=text.split(" ");
		
		Set<String> str=new LinkedHashSet<String>();
		
		for (int i = 0; i < word.length; i++) {
			
			str.add(word[i]);
					
		}
		System.out.println(str);
	}

}
