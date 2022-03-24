package oops.packageexplain.package2;

public class DiffPackage {
    public int z;
    int defaultZ;
    public int publicZ;
    private int privateZ = 100;
    private int atmCardNum = 1122;
    protected int protectedZ;
    public static  void printHello(){
        System.out.println("Hello");
    }

    public int getPrivateZ(){
        return this.privateZ;
    }
    protected void setAtmCardNum(int cardNum){
        this.atmCardNum = cardNum;
    }

}
