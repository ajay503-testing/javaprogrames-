package javaPrograms;

public class RevNumberDemo {

	
	public static void main(String[] ar)

{
		
  int num=1234;
  
     int rev=0;
     
     while(num!=0)
     {
    	 
    	 rev=rev*10+num%10;
    	 num=num/10;
    	 
     }
     
     System.out.println("revese a number:"+rev);
  
   
  
}
}
