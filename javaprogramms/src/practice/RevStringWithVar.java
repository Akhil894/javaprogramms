package practice;

public class RevStringWithVar {

	public static void main(String[] args) {
		
		String s="india";
		String rev="";
		
		char[] ch = s.toCharArray();
		
		for(int i=ch.length-1; i>=0; i--) {
			
			rev=rev+ch[i];
			
		}
		
		System.out.println(rev);

	}

}
