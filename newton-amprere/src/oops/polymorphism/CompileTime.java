package oops.polymorphism;

public class CompileTime {
    int sum(int a, int b){
        System.out.println("2 args sum is called");
        return  a+b;
    }
    int sum(int a, int b, int c){
        System.out.println("3 args sum is called");
        return a+b+c;
    }

    double sum(double a, double b){
        System.out.println("2 args double sum is called");
        return  a+b;
    }

    public static void main(String[] args) {
        CompileTime obj = new CompileTime();
        System.out.println(obj.sum(10, 20));
        System.out.println(obj.sum(10, 20, 30));
        System.out.println(obj.sum(10.1, 20.1));

    }
}
