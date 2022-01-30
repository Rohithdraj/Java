package Java2VScode;

public class Strings1 {
    public static void main(String[] args) {
        String str="Rohith";
        String str2=new String("Rohith");
        int l=str.length();
        System.out.println(l);
        System.out.println(str.toLowerCase());

        if(str.equals(str2)){
            System.out.println("both are equal");
        }
        else{
            System.out.println("not equals");
        }
    }
}
