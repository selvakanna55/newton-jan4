package oops.polymorphism;

public class Isinstanceofkeyword {
    public static void main(String[] args) {
        Student stud = null;
        Vegtable veg = new Vegtable();
        System.out.println(stud instanceof Student);
        System.out.println(veg instanceof Vegtable);


    }
}

class Student{
    int marks = 100;
    String name = "Newton";
}
class Vegtable{
    int calories;
    int weight;
}
