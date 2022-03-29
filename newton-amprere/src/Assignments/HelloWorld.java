package Assignments;

public class HelloWorld {
    public static void main (String[] args) {
        System.out.println("Hello World");
        Vehicle van = new Vehicle(10, 20);
        van.start();
        van.stop();
        System.out.println(van.seats);
    }
}

class Vehicle{
    int seats;
    int wheels;
    String regNo;
    int currentGear;
    int maxGears = 5;

    Vehicle(int seats, int wheels){
        this.seats = seats;
        this.wheels = wheels;
    }


    void start(){
        System.out.println("Vehicle is started");
    }

    void stop(){
        System.out.println("Vehicle is stopped");
    }
}