package stl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExpalin {
    static  void hashMapCall(){

        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(30);
        set2.add(20);
        set2.add(10);
        System.out.println(set2);
        set2.add(30);
        System.out.println(set2);

        LinkedHashSet<Integer> set3 = new LinkedHashSet<>();
        set3.add(30);
        set3.add(20);
        set3.add(10);
        System.out.println(set3);
        set3.add(30);
        System.out.println(set3);

    }
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        // set -> unique elements
//        ArrayList<Integer> set1 = new ArrayList<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        System.out.println(set1);
        set1.add(30);
//        hashMapCall();
        System.out.println(set1);
        System.out.println(set1.add(99));
        System.out.println(set1.add(99));
        System.out.println(set1.contains(10));
        System.out.println(set1.contains(111));

//        set1.iterator();




    }
}
