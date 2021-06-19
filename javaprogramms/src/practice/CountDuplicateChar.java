package practice;

import java.util.HashSet;

public class CountDuplicateChar {

	public static void main(String[] args) {
		
		String s= "india";
		
		char[] ch = s.toCharArray();
		
		HashSet<Character> set = new HashSet<Character>();
		
		for(int i=0; i<ch.length; i++) {
			
			set.add(ch[i]);
		}
		
		int count1=0;
		
		for(Character character: set) {
			
			int count=0;
			
			for(int i=0; i<ch.length; i++) {
				
				if(character == ch[i]) {
					
					count++;
				}
				
			}
			
			if(count>1)
				count1++;
		}
		System.out.println(count1);
			
		

	}

}
