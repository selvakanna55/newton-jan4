package oops;

public class Overloading {
    public static void main(String[] args) {
        Shape square = new Shape();
        System.out.println(square.findArea(10));
        System.out.println(square.findArea(10.0));
        Shape rectangle = new Shape();
        System.out.println(rectangle.findArea(10, 20));
    }

}


class Shape {

    double findArea(double s) {
        System.out.println("Double with 1 argument");
        // square
        return s * s;
    }

    int findArea(int s) {
        System.out.println("Integer with 1 argument");
        // square
        return s * s;
    }


    double findArea(double l, double b) {
        System.out.println("Double with 2 argument");
        //rectangle
        return l * b;
    }
}