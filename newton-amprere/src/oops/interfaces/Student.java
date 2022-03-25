package oops.interfaces;



public class Student{
    String name;
    int rollNo;
    int test1Mark;
    int test2Mark;

    int getAvg(){
        return  (test1Mark+test2Mark)/2;
    }
}