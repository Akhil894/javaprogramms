package practice;

public class SeparateNum {

	public static void main(String[] args) {
		
		String s="abc12#j%bh658";
		
		char[] ch = s.toCharArray();	
		
		String num="";
		
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]>='0' && ch[i]<='9') {
				
				num=num+ch[i];
			}
		}
		
		System.out.println(num);

	}

}
