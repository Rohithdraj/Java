package Java1;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a number to check palindrome");
		
		int num=s.nextInt();
		int num1=num;
		int rev=0;
		
		while(num!=0) {
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		if(num1==rev) {
			System.out.println("palindrome");
		}else
			System.out.println("not palindrome");
		

	}

}
