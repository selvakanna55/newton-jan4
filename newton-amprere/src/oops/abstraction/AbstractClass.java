package oops.abstraction;

public class AbstractClass {

}


abstract class Animal{
    int weight;
    public  int getWeight(){
        return weight;
    }

    abstract void eat();
}

class Cat extends Animal{
    // inheritance
    void eat() {
        System.out.println("Cat is eating");
    }
}

class Lion extends Animal{
    public  void eat(){
        System.out.println("Lion is eating");
    }
}