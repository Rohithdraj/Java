package Java2VScode;

public class Immutable {
    public static void main(String[] args) {
        String str="Rohith";  //immutable cannot change
        
        String str2=str.concat(" kumar");
        

        System.out.println(str2);
    }
}
