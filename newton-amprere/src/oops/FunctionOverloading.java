package oops;

public class FunctionOverloading {
    public static void main(String[] args) {
        Shape square = new Shape();
        System.out.println("Area of Square: "+square.getArea(10));
        Shape rectangle = new Shape();
        System.out.println("Area of Rectangle: "+rectangle.getArea(10, 20));
    }
}

class Shape{
    int getArea(int side){
        System.out.println("Calculating area of square");
        return  side*side;
    }

    int getArea(int length, int breath){
        System.out.println("Calculating area of rectangle");
        return length*breath;
    }

}