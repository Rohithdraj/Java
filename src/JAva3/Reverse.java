package JAva3;

public class Reverse {
    public static void main(String[] args) {
        String s="1234";
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());

        StringBuilder sb1=new StringBuilder(s);
        System.out.println(sb1.reverse());
    }
    
}
