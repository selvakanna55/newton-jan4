package oops.interfaces;

import java.util.Scanner;

public class ExampleInterface {
    public static void main(String[] args) {
        Student st = new Student();
        st.name = "Newton";
        st.test1Mark = 99;
        st.test1Mark = 100;
        st.rollNo = 10;
        System.out.println(st.getAvg());
        Scanner sc =  new Scanner(System.in);
        Lion abcd = new Lion();
//        String a = 10;
        new Lion().printAnimalName();
    }

}
//class Animal2{
//    void eat(){
//        System.out.println("animal eating");
//    }
//}
interface Animal{
    void eat();
}

interface  X{

}
class Lion implements Animal, X{
    String animalName = "Lion";
    public void eat(){
        System.out.println("Meat");;
    }
    public void printAnimalName(){
        System.out.println("hello");
        this.animalName ="11";
        System.out.println("Lion");
    }
}

class Rat implements Animal{
    public void eat(){
        System.out.println("Rice");
    }
}

class Cat implements Animal{
    public   void eat(){
        System.out.println("Rat");
    }

}