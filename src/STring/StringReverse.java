package STring;

public class StringReverse {

	public static void main(String[] args) {

		//approach 1
		String s="Rohith";
		
		for (int i = s.length()-1; i >=0; i--) {
			System.out.println(s.charAt(i));

		}
		System.out.println("-------------------");

		//approach 2
		String s1="bharath";
		char[] ch = s1.toCharArray();

		for (int i = ch.length-1; i >=0; i--) {
			System.out.println(s1.charAt(i));
		}
		System.out.println("-------------------");

		//approach 3

		String s3="raooolss";
		char[] ch1=s3.toCharArray();
		String rev="";

		for(int i=ch1.length-1;i>0;i--){
			rev=rev+ch1[i];
		}
		System.out.println(s3);
		System.out.println("-------------------");

		//approach4

		StringBuilder sb=new StringBuilder("Roshan");
		System.out.println(sb.reverse());




	}


}
