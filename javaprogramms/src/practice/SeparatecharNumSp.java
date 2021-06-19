package practice;

public class SeparatecharNumSp {

	public static void main(String[] args) {
		
		String s="abc@125%a*26";
		
		char[] ch = s.toCharArray();
		
		String chr="";
		String num="";
		String sp="";
		
		for(int i=0; i<ch.length; i++) {
			
			if(ch[i]>='A' && ch[i]<='z') {
				chr=chr+ch[i];
			}
			
			else if(ch[i]>='0' && ch[i]<='9') {
				num=num+ch[i];
				}
			
			else {
				sp=sp+ch[i];
			}
		}
		
		System.out.println(chr);
		System.out.println(num);
		System.out.println(sp);
	}

}
