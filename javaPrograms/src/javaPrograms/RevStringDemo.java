package javaPrograms;

public class RevStringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String str1="ajay";
		String rev="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			rev=rev +str1.charAt(i);
		}

		System.out.println("reverse a string:"+rev);
		
	}

}
