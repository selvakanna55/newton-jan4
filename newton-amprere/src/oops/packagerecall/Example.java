package oops.packagerecall;

import oops.inheritance.Vehicle;

public class Example {
    public static void main(String[] args) {
        Abc ex = new Abc();
        ex.x = 100;
        System.out.println(ex.x);

        Def ex2 = new Def();
        ex2.y = 99;
        System.out.println(ex2.y);

        Vehicle vc = new Vehicle();
        vc.start();
    }
}


class Abc{
    int x;
}