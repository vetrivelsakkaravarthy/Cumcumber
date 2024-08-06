package Jenkins;

public class demo_Jenkins {

	public static void main(String[] args) {
		String abc= "Welcome to the world";
		String reverse="";
		String[]a=abc.split(" ");
	
		//for(String variable:a) {
		for(int k=0;k<a.length;k++) {
			String variable=a[k];
			
			for(int i=variable.length()-1;i>=0;i--) {
				reverse +=variable.charAt(i);
				
			}
             if(k<a.length-1)
			reverse +=" ";
                
		}
		System.out.println(reverse);
		System.out.println(abc.length());
		System.out.println(reverse.length());
		//--------------------------------------------------
		String c="Welcome to the world";
		String reversed="";
		for(int j=c.length()-1;j>=0;j--){
		reversed +=c.charAt(j);
		
		
		
	}
		System.out.println(reversed);
		
	}

}
