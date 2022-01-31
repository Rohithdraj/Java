package Collection;

import java.util.HashSet;

public class PrintDuplicateWords_5 {

    public static void main(String[] args) {
        String s="welcome to inida welcome to mandya";
        //step1 convert the string to char array
        String[] ch = s.split(" ");

        //step2 get only unique char and add to set
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        }
        System.out.println(set);


        //step3 comaprision of set and all char of array
        for(String str: set ){
            int count=0;
            for(int i=0;i<ch.length;i++){
                if(str.equals(ch[i])){
                    count++;
                }
            }

            if(count>1) {
                System.out.println(str + " " + count);
            }
        }


    }
}
