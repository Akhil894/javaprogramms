package practice;

public class PrintSeparateChar {

	public static void main(String[] args) {
		
		String s="abc@123$xyz";
		
		char[] ch = s.toCharArray();
		
		String res="";
		String alpha="";
		String sp="";
		
		for(int i=0;i<ch.length;i++) {
			
			if(ch[i]>='A' && ch[i]<='z') {
				
				res=res+ch[i];
				
				
			}
			
			else if(ch[i]>='0' && ch[i]<='9') {
				
				alpha=alpha+ch[i];
				
				
				
			}
			
			else {
				
				sp=sp+ch[i];
				
				
			}
		}
		
  System.out.println(res);
  System.out.println(alpha);
  System.out.println(sp);

	}

}
