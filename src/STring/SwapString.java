package STring;

public class SwapString {

    public static void main(String[] args) {
        String s1="rohith";
        String s2="raj";

        System.out.println("before swapping ");
        System.out.println("s1==>"+s1);
        System.out.println("s2==>"+s2);
        System.out.println("-------------------------");

        s1=s1+s2;
        s2=s1.substring(0,s1.length()-s2.length());
        s1=s1.substring(s2.length());

        System.out.println("After swapping ");
        System.out.println("s1==>"+s1);
        System.out.println("s2==>"+s2);
        System.out.println("-------------------------");


    }





}
