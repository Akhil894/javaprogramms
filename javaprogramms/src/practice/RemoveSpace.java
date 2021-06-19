package practice;

public class RemoveSpace {

	public static void main(String[] args) {
		
		String s="welcome to india";
		
		String[] str = s.split(" ");
		
		String res="";
		
		for(int i=0; i<str.length; i++) {
			
			res=res+str[i];
		}
		
		System.out.println(res);
				

	}

}
