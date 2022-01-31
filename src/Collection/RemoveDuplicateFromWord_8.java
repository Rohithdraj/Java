package Collection;

import java.util.LinkedHashSet;

public class RemoveDuplicateFromWord_8 {
    public static void main(String[] args) {
        String s = "welcome to india welcome to mandya";
        //step1 convert the string to char array
        String[] ch = s.split(" ");

        //step2 get only unique char and add to set
        LinkedHashSet<String> set=new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        System.out.println(set);

        for(String ch1:set){
            System.out.print(ch1+" ");
        }

//        //step3 comaprision of set and all char of array
//        for (Character character : set) {
//            int count = 0;
//            for (int i = 0; i < ch.length; i++) {
//                if (character == ch[i]) {
//                    count++;
//                }
//            }
//
//            System.out.println(character + " " + count);
//        }

    }
}
