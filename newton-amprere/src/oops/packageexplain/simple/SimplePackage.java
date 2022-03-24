package oops.packageexplain.simple;

import oops.packageexplain.package2.DiffPackage;

public class SimplePackage {
    public static void main(String[] args) {
        System.out.println("Hi");
        SameFile sf = new SameFile();

        DiffFile df = new DiffFile();
        df.y = 99;
        df.defaultY = 10;
        df.protectedY = 100;
        df.publicY = 99;
        System.out.println(df.y);

        DiffPackage dp = new DiffPackage();
        dp.z = 555;
        dp.publicZ = 99;
//        dp.defaultZ = 10;
//        dp.protectedZ = 100;
//        dp.privateZ = 100;

        System.out.println(dp.z);
        System.out.println(dp.getPrivateZ());
    }
}

class SameFile{
    int defaultX;
    public int publicX;
    private int privateX;
    protected int protectedX;

    void testAll(){
        System.out.println(defaultX);
        System.out.println(publicX);
        System.out.println(privateX);
        System.out.println(protectedX);
    }
}