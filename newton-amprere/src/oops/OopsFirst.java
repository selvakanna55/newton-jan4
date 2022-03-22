package oops;

public class OopsFirst {

    public static void main(String[] args) {
      Circle c1 = new Circle();
      c1.setRadius(10);
        System.out.println("Area for circle c1: "+c1.getArea());
        System.out.println("Area for circle c1: "+c1.getArea());
        System.out.println(c1.toString());
    }
}

class Circle{
    //member variables
    double radius;

    public String toString() {
        return "Circle{" + "radius=" + radius + '}';
    }

    //setter fns
    void setRadius(int r){
        radius = r;
    }
    //getter fns
    double getRadius(){
        return radius;
    }
    // fns -> operation, calculations
    double getArea(){
        return 3.14*radius*radius;
    }

}

