package Java1;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter a word ");
		String s1=s.next();
		String rev="";
			
		String org_Str=s1;
		
		int length=s1.length();
		
		for (int i = length-1; i >=0; i--) {
			
			rev=rev+s1.charAt(i);
		}
		
		System.out.println(rev);
		
		if (org_Str.equals(rev)) {
			System.out.println("palinddrome");
		}else
			System.out.println("not palindrome");
		

	}

}
