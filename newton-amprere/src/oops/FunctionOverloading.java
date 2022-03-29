package oops;

public class FunctionOverloading {
    public static void main(String[] args) {
        Shapes square = new Shapes();
        System.out.println("Area of Square: "+square.getArea(10));
        Shapes rectangle = new Shapes();
        System.out.println("Area of Rectangle: "+rectangle.getArea(10, 20));
    }
}

class Shapes{
    int getArea(int side){
        System.out.println("Calculating area of square");
        return  side*side;
    }

    int getArea(int length, int breath){
        System.out.println("Calculating area of rectangle");
        return length*breath;
    }

}