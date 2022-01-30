package Java2VScode;

public class Rev {
    public static void main(String[] args) {
        String s="hello";
        String rev="";
        int length=s.length();

        for(int i=length-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);

        StringBuilder sb=new StringBuilder(s);
        System.out.println(sb.reverse());
    }
    
}
