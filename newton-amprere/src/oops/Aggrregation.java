package oops;

public class Aggrregation {
    public static void main(String[] args) {
        Address ad1 = new Address();
        ad1.doorNo = 11;
        ad1.streetName = "ab st";
        ad1.district = "pune";

        Employee e1 = new Employee(ad1,"Newton", 65);
        System.out.println(e1.permanentAddress.district);
        System.out.println(e1.name);
        System.out.println(e1.age);
    }
}


class Employee{
    Address permanentAddress;
    String name;
    int age;
    Employee(Address permanentAddress, String name, int age){
        this.permanentAddress = permanentAddress;
        this.name= name;
        this.age = age;
    }
}

class Address{
    int doorNo;
    String streetName;
    String district;
}