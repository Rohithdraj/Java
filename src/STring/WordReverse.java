package STring;

public class WordReverse {
    public static void main(String[] args) {
        String s="hello java world";
        System.out.println("given original string is==> "+s);
        String rev1=" ";

        String[] splitting = s.split("");
        for(int j=splitting.length-1;j>=0;j--){
           rev1=rev1+splitting[j];
        }
        System.out.println(rev1);

        //split method will remove the letters
        String[] ssss = s.split("a");
       for(String ss:ssss){
           System.out.print(ss);
       }
        System.out.println("");



        String[] word = s.split(" ");
        String orgStrrev="";

        for(String str:word){
            String wordrev="";
            for(int i=str.length()-1;i>=0;i--){
                wordrev=wordrev+str.charAt(i);
            }
            orgStrrev=orgStrrev+" "+wordrev;
        }
        System.out.println(orgStrrev);

        //approach for reverse print
        String rev=" ";
        for(int i=word.length-1;i>=0;i--){
            rev=rev+" "+word[i];
        }
        System.out.println(rev);

    }


}
