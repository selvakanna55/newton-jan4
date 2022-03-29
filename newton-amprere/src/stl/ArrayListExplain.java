package stl;

import java.util.ArrayList;
import java.util.Vector;


public class ArrayListExplain {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
//      Vector<Integer> nums = new Vector<Integer>();
        students.add("Newton");
        students.add("ABcd");
        students.add("efgh");
        System.out.println(students);

        // check Newton present in student or not
        String name = "Newton";
        System.out.println(students.contains(name));
        // mnop present?
        System.out.println(students.contains("mnop"));

        System.out.println(students);
        System.out.println(students.remove("ABcd"));
        System.out.println(students);
        students.remove(0);
        System.out.println(students);
    }
}
