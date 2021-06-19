package practice;


import java.util.LinkedHashSet;

public class RemoveDuplicateChar {

	public static void main(String[] args) {
		
		String s="amma";
		
		char[] ch = s.toCharArray();
		
		LinkedHashSet<Character> set = new LinkedHashSet<Character>();
		
		for(int i=0; i<ch.length; i++) {
			
			set.add(ch[i]);
		}
		
		String res="";
		
		for(Character character: set) {
			
			res=res+character;
		}
		
		System.out.println(res);

	}

}
