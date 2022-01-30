package Java1;

public class MaxAndMinElementsInarray {

	public static void main(String[] args) {
		
		int a[]= {10,30,90,5,75};
		
		int max=a[0];
		
		for (int i = 1; i < a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
			

	}

}
