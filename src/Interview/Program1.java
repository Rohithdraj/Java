package Interview;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        getString("BC", "BANGALORE");
    }

    public static void getString(String str1, String str2) {
        List<Character> list1 = new ArrayList<>();
        List<Character> list2 = new ArrayList<>();

        for (int i = 0; i < str1.length(); i++) {
            list1.add(str1.charAt(i));
        }
        List<Character> l1 = new ArrayList<>(list1);

        for (int j = 0; j < str2.length(); j++) {
            list2.add(str2.charAt(j));
        }
        List<Character> l2 = new ArrayList<>(list2);

        System.out.println(l1+" "+l2);

        list1.removeAll(list2);
        l2.removeAll(l1);
        String op1 = list1.toString();
        String op2 = l2.toString();
        System.out.println(op1 + " " + op2);

    }

}