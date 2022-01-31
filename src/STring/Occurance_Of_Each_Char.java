package STring;

import java.util.HashSet;

public class Occurance_Of_Each_Char {
    public static void main(String[] args) {
        String s="Welcome";
        //convert the string to array
        char[] ch = s.toCharArray();

        //declare a set
        HashSet set=new HashSet();

        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        }

        //
    }
}
