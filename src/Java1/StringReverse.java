package Java1;

public class StringReverse {

	public static void main(String[] args) {
		String s="Rohith";
		String rev="";
		char[] ch = s.toCharArray();
		
		for (int i = ch.length-1; i >=0; i--) {
			System.out.println(ch[i]);
			rev=rev+ch[i];
		}
		
		System.out.println(rev);

	}

}
