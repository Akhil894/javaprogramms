package practice;

import java.util.LinkedHashSet;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
	
		String s= "welcome to india welcome to hyderabad";
		
		String[] str = s.split(" ");
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length; i++) {
			
			set.add(str[i]);
		}
		
		String res="";
		
		for(String word: set) {
			
			res=res+" "+word;
			
		}
		
		System.out.println(res);

	}

}
