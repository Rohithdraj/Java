package Array;

public class MAxLengthOfStringInArray {
    public static void main(String[] args) {
        String [] str={"nave","rohith","roti","dog","catter","cat"};

        String min=str[0];

        for(int i=1;i<str.length;i++){
            if(min.length()>=str[i].length()){
                if(min.length()==str[i].length()){
//                    max=str[i];
                    System.out.println(min);
                }
                min=str[i];
//
            }

        }
        System.out.println(min);

    }


}
