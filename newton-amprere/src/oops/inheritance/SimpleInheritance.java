package oops.inheritance;

import oops.packageexplain.simple.Car;

public class SimpleInheritance {
    public static void main(String[] args) {

//
        Car i20 = new Car(4, 4, true, true, 4);
        System.out.println(i20.wheels);
//        System.out.println(i20.isAc);
//        System.out.println(i20.noOfLights);

    }
}


class Cycle extends Vehicle{
    boolean hasMudGaurd;
    Cycle(int wheels, int seats, boolean hasMudGaurd){
        super(wheels,seats);
        System.out.println("new Cycle is created");
        this.hasMudGaurd = hasMudGaurd;
    }
    public  void start(){
        super.start();
        System.out.println("Cycle is stared");
    }
}

class GearCycle extends Cycle{

    int noOfGears;
    int defaultGear;
    GearCycle(int wheels, int seats, int noOfGears){
        super(wheels, seats, true);
        this.noOfGears = noOfGears;
        this.defaultGear = 3;
        System.out.println("Gear cycle is Created");
    }
    public  void start(){
        System.out.println("Gear cycle is started");
    }
}
