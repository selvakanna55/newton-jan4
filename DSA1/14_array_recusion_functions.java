import java.util.Scanner;

class Main{
    static int getsumTillN(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+getsumTillN(n-1);
        }
        // getsumTillN(3) = 6
        // 3==0 NO   3+getsumTillN(2) 3+3 = 6
        //getsumTillN(2) = 3
        // 2==0  NO   2+getsumTillN(1) 2+1 = 3
        //getsumTillN(1) = 1
        // 1==0 NO 1+getsumTillN(0) -> 1+0 =1
        //getsumTillN(0) -> 0
        //0==0 YES 0
    }


    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int sumOfN = getsumTillN(number);
        System.out.println(sumOfN);
        System.out.println("END MAIN");
    }
}



import java.util.Scanner;

class Main{
    static double getSumOfTwoNumbers(double a, double b){
        double sum = a+b;
        return sum;
    }

    static void printHello(){
        System.out.println("Hello World");
    }

    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        double number1 = sc.nextDouble();
        double number2 = sc.nextDouble();

        // // // break this into seperate function
        double sumOfTwo = getSumOfTwoNumbers(number1, number2);
        System.out.println(sumOfTwo);
        printHello();

    }
}


import java.util.Scanner;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // className obj = new ClassName(constr)

        int a = sc.nextInt();
        int b = sc.nextInt();

        try{
            int divOfTwo = a/b;
            System.out.println(divOfTwo);
        }
        catch (ArithmeticException e){
            System.out.println("Looks like some arithmatic error in input");
        }

        int sumOfTwo = a+b;
        System.out.println(sumOfTwo);

    }
}