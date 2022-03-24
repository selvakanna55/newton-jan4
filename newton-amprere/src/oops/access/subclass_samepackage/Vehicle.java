package oops.access.subclass_samepackage;
public  class Vehicle{
    int wheels = 2; // default
    public int seats = 4;
    private int weight = 6;
    protected int length = 8;

    int getWeight(){
        return this.weight;
    }
    void setWeight(int weight){
        this.weight = weight;
    }
}