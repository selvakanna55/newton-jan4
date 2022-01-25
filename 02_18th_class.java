// create object
class Solution{
    int addTwoNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }
    public void solve(){
        System.out.println("From new class");
        int valueA = 10;
        int valueB = 20;
        int sum = addTwoNumbers(valueA,valueB);
        System.out.println(sum);
    }
}

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}






//exception handling
import java.util.Scanner;
class Solution{
    void checkPrice(int price) throws ArithmeticException{
        if(price<0){
            String exceptionMessage = "Price "+price+" cannot be less than 0";
            throw new ArithmeticException(exceptionMessage);
        }
        System.out.println("Price "+price+" is valid. storing data into DB");
    }

    public void solve(){
        Scanner sc = new Scanner(System.in);
        int valA = sc.nextInt();
        int valB = sc.nextInt();

        // perform division
        try{
            int divVal = valA/valB;
            System.out.println("Div: "+divVal);
        }catch(ArithmeticException e){
            System.out.println("Exception raised in division, proceeding to next lines");
        }

        //perform additon
        int addVal = valA+valB;
        System.out.println("Add: "+addVal);

        int price = sc.nextInt();
        checkPrice(price);
    }
}

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}





//if
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int valueA = sc.nextInt();
        int valueB = sc.nextInt();


        if(valueB != 0){ //! -> not       = -> equal 
            int div = valueA/valueB;
            System.out.println("Division: "+div);
        }
        else{
            System.out.println("Provided valueB is 0, Division cannot be performed");
        }
        
       int sum = valueA + valueB;
       System.out.println("Addition: "+sum);
    }
}


// is odd or even
import java.util.Scanner;

class Main{
    public static void main(String args[]) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        // number is odd or even 
        // even divisble 2
        // not div 

        // ///if()    
        // int res = 10/2; //5
        // int ans = 10%2; //0
        if(number1 % 2 == 0){ // is number1%2 is equal to 0
            System.out.println("Even");
        }
        else{ //number1%2 is equal to 1
            System.out.println("Odd");
        }

    }
}


// grade calculation
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();

        if(mark>80){ //81-100
            System.out.println("A Grade");
        }
        else if(mark > 70){ // 71-80
            System.out.println("B Grade");
        }
        else if(mark > 60){//61-70
            System.out.println("C Grade");
        }
        else{//0-59
            System.out.println("D Grade");
        }
    }
}



// switch calculation
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch( number){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break; 
            case 4:
                System.out.println("FOUR");
                break; 
            default: 
                System.out.println("Number not in range of 1 to 4");
        }
        
    }
}


// biggest number
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int maximumNumber;

        if(number1 > number2){
            maximumNumber = number1;
        }
        else{
            maximumNumber = number2;
        }

        maximumNumber = (number1>number2) ? number1:number2;
        
        System.out.println(maximumNumber + " is the Biggest");


        
    }
}

//test
import java.util.Scanner;

class Main{
    public static void main(String args[]) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();

        // number is odd or even 
        // even divisble 2
        // not div 

        // ///if()    
        // int res = 10/2; //5
        // int ans = 10%2; //0
        if(number1 % 2 == 0){ // is number1%2 is equal to 0
            System.out.println("Even");
        }
        else{ //number1%2 is equal to 1
            System.out.println("Odd");
        }

    }
}
