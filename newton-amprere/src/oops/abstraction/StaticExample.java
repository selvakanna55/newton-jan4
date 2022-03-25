package oops.abstraction;

// System.out.println(getSum(10, 209));
////        StaticExample se = new StaticExample();
////        System.out.println(se.getSum(10, 20));
//         Student s1 = new Student();
//         System.out.println(s1.getMarks());
//
//         System.out.println(Student.getMarks());
//         System.out.println(Student.subject);
//         Student.subject = "Maths";
//         System.out.println(Student.subject);


public class StaticExample {

    int x;
    static  int getSum(int a, int b){
        return a+b;
    }

    public static void main(String[] args) {
        Student s = new Student();
        s.setMarks(10);
        System.out.println(s.getMarks());

    }
}


class Student{
    private int marks = 99;
    //setter function
    public  void setMarks(int mark){
        this.marks = mark;
    }
    // getter function
    public  int getMarks(){
        return marks;
    }
    public int maximumMark = 100;
    static String subject = "Social Scinece";
    //call the function without creating object
//    static int getMarks(){
////        return this.marks;
//        return  77;
//    }


}
