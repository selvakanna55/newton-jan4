package oops.inheritance;

public class SimpleShape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.setSize(10.0);
        System.out.println("Area of circle c is: "+ c.findArea());

        Square sq = new Square();
        sq.setSize(5);
        System.out.println("Area of square sq is: "+ sq.findArea());

        Test tc = new Test();
        tc.setSize(10);
        System.out.println("Area of Test is: "+ tc.findArea());




    }
}

class Shape{ // parent
    double size;
    double getSize() {
        return size;
    }
    void setSize(double size) {
        System.out.println("hey setting size");
        this.size = size;
    }
}

class Circle extends  Shape{
    double findArea(){
        return 3.14*size*size;
    }
}


class Square extends Shape{
    double findArea(){
        return size*size;
    }
}

class Test extends Square{
    double findArea(){
        return  10.5*getSize()*3.14; // random calculation
    }
}

