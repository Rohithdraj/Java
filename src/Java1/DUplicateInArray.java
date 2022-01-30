package Java1;

import java.util.HashSet;

public class DUplicateInArray {

	public static void main(String[] args) {
		// approcah 1
		
		String[]str= {"hello","rohith","kavi","hello"};
		
		boolean flag=false;
		
		HashSet<String> hsh=new HashSet<>();
		
		for (String string : str) {
			
			if(hsh.add(string)==false) {
				System.out.println("found duplicate");
				flag=true;
			}
			
		}
		if(flag==false) {
			System.out.println("no duplicate");
		}
		
		
		//approach 2
		boolean flag1=false;
		for(int i=0;i<str.length;i++) {
			for(int j=i+1;j<str.length;j++) {
				if(str[i]==str[j]) {
					System.out.println("found duplicate ");
					flag1=true;
				}
			}
			if(flag1==false) {
				System.out.println("duplicate not found");
			}
		}

	}
	
	
	

}
