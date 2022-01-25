import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // user input

        System.out.println("Hello World");
        
    }
}





class Solution{

    // addition
    // {RT} function name
    void printSumOfTwoNumbers(){
        int a = 10;
        int b = 20;
        int sum = a+b;
        System.out.println(sum);
    }

    public void solve(){
        System.out.println("Before");
        printSumOfTwoNumbers(); // calling       
        System.out.println("After");
  
    }

}






class Main{
    public static void main(String args[]){
        Solution sol = new Solution(); //object here      
        sol.solve(); // calling method
    }
}





// functions

import java.util.Scanner;

class Solution{

    // addition
    // {RT} function name
    int sumOfNumbers(int number1, int number2){
        int sum = number1+number2;
        return sum;
    }

    int sumOfNumbers(int number1, int number2, int number3){
        int sum = number1+number2+number3;
        return sum;
    }

    public void solve(){
        System.out.println("Before");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int sumOf2 = sumOfNumbers(a,b); // calling
        System.out.println(sumOf2); 

        int sumOf3 = sumOfNumbers(a,b, c); // calling
        System.out.println(sumOf3); 


        System.out.println("After");
  
    }

}


class Main{
    public static void main(String args[]){
        Solution sol = new Solution(); //object here      
        sol.solve(); // calling method
    }
}




// time complexity
import java.util.Scanner;

class Solution{

    
    public void solve(){
        System.out.println("Before");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0; // 1 rupee
        float abc = 3.0f; // 1 rupee

        int c = 10+20 ; // 1 rupee


        // 10 rupee + 1 rupee+ 11 rupee + 10 rupee =  32 rupee
        for(int i=1;i<=n;i++){ // 11<=10 
            sum = sum + i; // sum = 1 // 10 // 10*1 = 10l;
            // sum = 1+2 = 3
            // sum = 3+3 = 6
            //...
        }// 
        //(n*3) +2 = 30+2
        // 60+2 = 62
        // 30+2 
        // 12+2
        

        System.out.println(sum);

        int newSum = (n*(n+1))/2; // 1
        //x =  (n+1) // 1 rupee
        // y = n*(x) // 1 rupee
        // z = y/2  // 1 rupee
        // 3 rupee

        System.out.println(newSum);
        System.out.println("After");
  
    }

}

// n -> 10 = 1+2+3+4+...+n
// 3 -> 1+2+3


class Main{
    public static void main(String args[]){
        Solution sol = new Solution(); //object here      
        sol.solve(); // calling method
    }
}


// time complexity 2
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // no print for 0, 1, 2
        if(n>=3){ //1 ruppee
            // print number 1 to n
            for(int i=1;i<=n;i++){ // loop takes n
                System.out.println(i);
            }

        }
        // if input is <=2 then 1 => best case 
        // otherwise n => worst case


        // 1 => 0
        // 1


        // 1 + n+1 + n + n + (n/2)
        // 2+ 3n + n/2 = 
        // ignore /denomi
        // 2+3n+n = 2+ 4n
        // ignore constant value
        // 4n 
        // n

        // O(n) // 4 


    }
}




// example problem

// h1   h2  v1  v2
//4     2   2   4

4 -> (4+2) 6  8   10  12 14 16 ........  
2 -> (2+4) 6  10  14  18 22 .......

49 43 3 5 // 
49 -> 52 55 58 61 64 (+3)
43 -> 48 53 58 63    (+5)


6 0 3 5


// O(4000) -> taking much time

for(int i=0;i<40000;i++){

    if(h1==h2){
        return true;
    }
    else{
        h1 = h1+v1;  // 4+2 = h1
        h2 = h2 + v2; // 2+4 = h2
    }
}

return false;



// O(3) -> O(1) -> taking less time -> better than looping approch
(v2>v1) && (6) % (2) == 0 return true
return false; /// 0(1)



