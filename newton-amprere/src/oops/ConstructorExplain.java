package oops;

public class ConstructorExplain {
    public static void main(String[] args) {
        Car bmw = new Car("read", "560D", 1234, "BMW", 2022);
        Car audi = new Car();
        Car nexa = new Car("Nexa");
//        bmw.color = "Red";
//        bmw.year = 2022;
//        bmw.chasisNo = 99889988;
//        bmw.brand = "BMW";
//        bmw.model = "560D";

//        System.out.println("Chassis No:"+bmw.chasisNo);
//        System.out.println("Color :"+bmw.color);
//        System.out.println("Model :"+bmw.model);
//        System.out.println("Brand :"+bmw.brand);
//        System.out.println("Year :"+bmw.year);
    }
}


class Car{
    // no parameter constructor
    Car(){
        System.out.println("0 arguments constructor ");
        System.out.println("New car is created, but values are still default");
    }
    // 5 arguments constructor
    Car(String color, String model, int chasisNo, String brand, int year){
        System.out.println("5 arguments constructor ");
        this.color = color;
        this.model = model;
        this.chasisNo = chasisNo;
        this.brand = brand;
        this.year = year;
        System.out.println("New car is created");
    }
    Car(String brand){
        System.out.println("1 argument constructor");
        System.out.println("brand is initialized");
        this.brand = brand;
    }
    String color;
    String model;
    int chasisNo;
    String brand;
    int year;
}