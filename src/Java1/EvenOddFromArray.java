package Java1;

public class EvenOddFromArray {

	public static void main(String[] args) {
		
		int [] a= {1,2,3,4,5};
		int evencount=0;
		int oddcount=0;
		
		for(int i : a) {
			if(i%2==0) {
				System.out.println(i);
				evencount++;
			}
		}
		
		System.out.println(evencount);

	}

}
