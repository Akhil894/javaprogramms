package practice;

public class RevCharOfWord {

	public static void main(String[] args) {
		
String s="welcome to india";
		
		String[] str = s.split(" ");
		
		for(int i=0;i<str.length;i++) {
			
			String temp= str[i];
			String rev="";
			
			for(int j=temp.length()-1;j>=0;j--) {
				
				rev=rev+temp.charAt(j);
				
			}
			
			System.out.print(rev+" ");
			
			
		}

	}

}
