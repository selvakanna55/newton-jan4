package oops.access.subclass_samepackage;



public class Van extends  Vehicle{
    int noOfAcs = 10;
    // any type you have will be accessible by same class irrespective of modifiers

    public static void main(String[] args) {
        Van v = new Van();
        System.out.println(v.wheels);
        System.out.println(v.seats);
//        System.out.println(v.weight);
        System.out.println(v.getWeight());
        // private is not accessible
        System.out.println(v.length);
    }
}
