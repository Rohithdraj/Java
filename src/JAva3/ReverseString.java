package JAva3;

public class ReverseString {
    public static void main(String[] args) {
        
        String s="hello";

        String rev="";

        int length=s.length();

        s.charAt(0);

        for(int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

    }
    
}
