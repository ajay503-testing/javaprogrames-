package javaPrograms;

public class RevNumberDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num=1234;
		
		
		StringBuffer b=new StringBuffer(String.valueOf(num));
		
		
		StringBuffer rev=b.reverse();
		
		System.out.println("revese a number by using stringbuffer:"+rev);
		
	}

}
