package practice;

import java.util.HashSet;

public class CountDuplicateWord {

	public static void main(String[] args) {
		
String s= "welcome to india welcome to hyderabad";
		
		String[] str = s.split(" ");
		
		HashSet<String> set = new HashSet<String>();
		
		int count1=0;
		
		for(int i=0; i<str.length; i++) {
			
			set.add(str[i]);
		}
		
		for(String word: set) {
			
			int count=0;
			
			for(int i=0; i<str.length;i++) {
				
				if(word.equals(str[i])) {
					count++;
				}
			}
			
			if(count>1)
			
		count1++;
		}
		
		System.out.println(count1);


	}

}
