package fromVScode;
import java.util.Arrays;
import java.util.Scanner;

public class Array1 {
    public static void main(String[] args) {
       // int[] a={10,20,30,40,100};

        int[]a=new int[5];
        Scanner s=new Scanner(System.in);

        System.out.println("enter the values for array");

            for(int i=0;i<5;i++){
                a[i]=s.nextInt();
            }
            
               
            Arrays.sort(a);
            System.out.println("sorted array elements are: ");
        for (int i : a) {
            System.out.println(i);
        }
        s.close();
    }
    
}
