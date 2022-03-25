package oops.polymorphism;

class X{

}


public class Phone extends X{
    int screenSize;
    int ram;
    int processor;
    Phone(){
        System.out.println("Phone is created");
    }
    Phone(int ram){
        this.ram = ram;
    }

    void call(int number){
        System.out.println("Calling from Phone to "+number);
    }
}

