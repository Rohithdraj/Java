package Java1;

import java.util.Arrays;

public class CheckArraysEquals {

	public static void main(String[] args) {
		int [] a= {1,2,3,4,5};
		int [] b= {1,2,3,4,5};
		
		boolean status = Arrays.equals(a, b);
		
		if(status==true) {
			System.out.println("arrays are equal");
		}
		else
			System.out.println("arrays are not equal");
		
		
		
		//Approach 2
		
		boolean status1=true;
		
		if(a.length==b.length) {
			for(int i=0;i<a.length;i++) {
				if(a[i]==b[i]) {
					status1=false;
				}
			}
			
		}else {
			System.out.println("arrays not equal");
			status1=false;}

	}

}
