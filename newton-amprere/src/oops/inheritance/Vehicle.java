package oops.inheritance;

public class Vehicle {
    protected  int wheels;
    int seats;
    Vehicle(){
        System.out.println("empty");
    }
    void start(){
        System.out.println("Vehicle started");
    }
    protected  Vehicle(int wheels, int seats){
        // vehicle cannot be crated without seats and wheels
        this.seats = seats;
        this.wheels = wheels;
        System.out.println("new vehicle is created");
    }
}
