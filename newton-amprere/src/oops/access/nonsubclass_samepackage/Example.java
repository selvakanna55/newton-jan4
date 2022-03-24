package oops.access.nonsubclass_samepackage;

public class Example {
    public static void main(String[] args) {
        Bus b = new Bus();
        System.out.println(b.a);
        System.out.println(b.b);
//        System.out.println(b.c);
        // you cannot access private members
        System.out.println(b.d);
    }
}
