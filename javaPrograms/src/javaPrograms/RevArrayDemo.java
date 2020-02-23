package javaPrograms;

import java.util.Arrays;

public class RevArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,3,4,5};
		
		  int maxIndex=a.length-1;
		  
		  System.out.println(a.length-1);
		  int halfIndex=a.length/2;
		  
		  for(int i=0;i<halfIndex;i++)
		  {
			  int temp=a[i];
			  a[i]=a[maxIndex-i];
			  a[maxIndex-i]=temp;
			  
		  }
		
		System.out.println(Arrays.toString(a));
		
	}

}
