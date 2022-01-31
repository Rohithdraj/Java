package Collection;

import java.util.HashSet;

public class FindDuplicateCount_3 {
    public static void main(String[] args) {
        String s="welcome to india";
        //step1 convert the string to char array
        char[] ch = s.toCharArray();

        //step2 get only unique char and add to set
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<ch.length;i++){
            set.add(ch[i]);
        }
        System.out.println(set);


        //step3 comaprision of set and all char of array
        int count1=0;
        for(Character character: set ){
            int count=0;
            for(int i=0;i<ch.length;i++){
                if(character==ch[i]){
                    count++;
                }
            }

            //System.out.println(character+" "+count);
            if(count>1){
                count1++;
            }

        }
        System.out.println(count1);

    }
}
