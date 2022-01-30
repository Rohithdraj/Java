package Java2VScode;

import java.util.Scanner;

public class Add {
    public static void main(String[] args) {
        int a,b,c;
        System.out.println("ENter any two number");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        b=s.nextInt();
        c=a+b;
        System.out.println("Sum of two numbers "+c);
        s.close();
    }
}
