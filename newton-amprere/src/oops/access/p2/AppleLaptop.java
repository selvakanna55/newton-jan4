package oops.access.p2;

import oops.access.p1.Laptop;

public class AppleLaptop extends Laptop {
    public int a;
    private int b;

    public static void main(String[] args) {
        AppleLaptop ap = new AppleLaptop();
//        System.out.println(ap.keys);
        System.out.println(ap.hdd);
//        System.out.println(ap.ram);
        System.out.println(ap.ssd);
    }
}
