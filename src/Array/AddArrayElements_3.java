package Array;

public class AddArrayElements_3 {
    public static void main(String[] args) {
        int [] a={1,3,5,5};
        int [] b={2,5,8};

        int size=a.length;
        if(size<b.length){
            size=b.length;
        }

        for(int i=0;i<size;i++){
            try {
                System.out.println(a[i] + b[i]);
            }catch (Exception exception){
                System.out.println(a[i]);
            }
        }
    }

}
