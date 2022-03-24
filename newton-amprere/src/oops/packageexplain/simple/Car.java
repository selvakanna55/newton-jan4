package oops.packageexplain.simple;

import oops.inheritance.Vehicle;



public  class Car extends Vehicle {
    boolean isAc;
    boolean isCentralLock;
    int noOfLights;
    public Car(int wheels, int seats, boolean isAc, boolean isCentralLock, int noOfLights){
        super(wheels, seats);
        this.isAc = isAc;
        this.isCentralLock = isCentralLock;
        this.noOfLights  = noOfLights;
        System.out.println("Car is created");
    }
}