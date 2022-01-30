package Java2VScode;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int a, b, c;
        
        System.out.println("Enter first value: ");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("Enter second value: ");
        b = s.nextInt();
        System.out.println("Enter your choice ");
        String ch = s.next();

        switch (ch) {
            case "+":
                c = a + b;
                System.out.println("addition " + c);
                break;
            case "-":
                c = a - b;
                System.out.println("subtraction " + c);
                break;
            case "*":
                c = a * b;
                System.out.println("multiplication " + c);
                break;
            case "/":
                c = a / b;
                System.out.println("division " + c);
                break;
            case "%":
                c = a % b;
                System.out.println("remainder " + c);
                break;

            default:
                System.out.println("invalid choice ");

                s.close();

        }
    }

}
