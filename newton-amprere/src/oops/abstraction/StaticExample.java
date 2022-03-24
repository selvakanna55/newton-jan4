package oops.abstraction;

public class StaticExample {

    int x;
    int getSum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
//        StaticExample se = new StaticExample();
//        System.out.println(se.getSum(10, 20));

        System.out.println(Student.getMarks());
        System.out.println(Student.subject);
        Student.subject = "Maths";
        System.out.println(Student.subject);
//        Student x  = new Student();
        System.out.println(new Student().subject);


//        System.out.println(Student.maximumMark);
    }
}


class Student{
    private int marks = 99;
    public int maximumMark = 100;
    static String subject = "Social Scinece";
    //call the function without creating object
    static int getMarks(){
//        return this.marks;
        return  77;
    }
}
