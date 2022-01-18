import java.util.Scanner;

class Main{
    static void printSumofTwoNumber(int a, int b){ //arguments
        int sumofTwoNumbers = a+b;
        System.out.println("Printing from function: "+sumofTwoNumbers);
    }

    static int getSumofTwoNumber(int a, int b){ //function with return type
        int sumofTwoNumbers = a+b;
        return sumofTwoNumbers;
    }

    public static void main(String args[]){
        //simple addititon
        int valueA = 10;
        int valueB = 20;
        int sum = valueA + valueB;
        System.out.println("Addition of initial value: "+sum);

        // get input and do addition
        Scanner sc = new Scanner(System.in);
        valueA = sc.nextInt();
        valueB = sc.nextInt();
        sum = valueA + valueB;
        System.out.println("Addition of custom input: "+sum);
        
        // perform addition using function
        printSumofTwoNumber(valueA, valueB);

        // peroform addition using function with return type
        int sumValue = getSumofTwoNumber(valueA, valueB);
        System.out.println("Additon with return type function: "+sumValue);

        // operators
        sumValue+=11; // +=11 is same as sumValue = sumValue+11;
        System.out.println("Add 11 to 300: "+sumValue);
        sumValue++; // ++ means increament by 1;
        System.out.println("Add 1 using ++ operator: "+sumValue);
        sumValue/=2; // sumValue/=2 is equal to sumValue = sumValue/2
        System.out.println("Divide sumValue by 2 using / operator: "+sumValue);

    }
}