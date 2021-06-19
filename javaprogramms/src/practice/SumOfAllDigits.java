package practice;

public class SumOfAllDigits {

	public static void main(String[] args) {
	
		
		String s="123@abc^654";
		char[] ch = s.toCharArray();
		
		int sum=0;
		
		for(int i=0; i<ch.length;i++) {
			
			if(ch[i]>='0'&& ch[i]<='9') {
				
				int num = ch[i]-48;
				sum=sum+num;
			}
		}
		
		System.out.println(sum);

	}

}
