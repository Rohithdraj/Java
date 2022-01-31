package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateMAintainInsertion_7 {
    public static void main(String[] args) {
        String s = "welcome";
        //step1 convert the string to char array
        char[] ch = s.toCharArray();

        //step2 get only unique char and add to set
        LinkedHashSet <Character> set=new LinkedHashSet<>();
        for (int i = 0; i < ch.length; i++) {
            set.add(ch[i]);
        }
        System.out.println(set);

        for(Character ch1:set){
            System.out.print(ch1);
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

