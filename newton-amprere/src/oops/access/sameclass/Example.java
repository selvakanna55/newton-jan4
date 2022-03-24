package oops.access.sameclass;

public class Example {
        static  int a; // default
        static  public int b;
        static  private int c;
        static  protected  int d;

        public static void main(String[] args) {
                Example ex = new Example();
                ex.a = 99;
                ex.b=101;
                ex.c = 91;
                ex.d=88;
                System.out.println(ex.a);
                System.out.println(ex.b);
                System.out.println(ex.c);
                System.out.println(ex.d);
        }
}
//
//class SameClass{
//
//}