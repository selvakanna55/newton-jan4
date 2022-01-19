//recalling data types

class Main{
    public static void main(String args[]){
        byte byteNumber = 101;
        short shortNumber = 101; 
        int wholeNumber = 10;
        long longNumber = 9999;

        float floatNumber = 10.1f; // f is needed otherwise use double
        double doubleNumber = 10.9999;

        char charValue = 'a';
        boolean booleanValue = true;

        String s = "Newton";
        System.out.println(s);

        int arr[] = new int[3];
        arr[0] = 10;
        arr[1] = 77;
        arr[2] = 65;
        // arr[3] = 100; // not allowed 0 based indexing
        System.out.println(arr[0]);
        int arr2[] = {1,2,3};
    }
}


// is multiple of 7 and 10
//seperate
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        // is divisible by 7
        if(number%7 == 0){
           System.out.println("7 YES");
        }
        else{
            System.out.println("7 NO");
        }

        // is divisible by 10
        if(number%10 == 0){
             System.out.println("10 YES");
        }
        else{
            System.out.println("10 NO");
        }    
    }
}


// is divisible by 7 & 10
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        
        if((number%7 == 0) && (number%10 == 0)){
             System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
        // is divisible by 7
        // if(number%7 == 0){
        //    System.out.println("7 YES");
        // }
        // else{
        //     System.out.println("7 NO");
        // }

        // // is divisible by 10
        // if(number%10 == 0){
        //      System.out.println("10 YES");
        // }
        // else{
        //     System.out.println("10 NO");
        // }    
    }
}



// print 1 to 4
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int number = 1;
        System.out.println(number);
        // ++ means increament by 1 => number = number + 1;
        number++;
        System.out.println(number);
        number++;
        System.out.println(number);
        number++;
        System.out.println(number);

    }
}



// while loop
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int number = 1;
        // 1 <= 4 -> true go inside -> print -> 2
        // 2 <= 4 -> true go inside -> print -> 3
        // 3 <= 4 -> true go inside -> print -> 4
        // 4 <= 4 -> true go inside -> print -> 5
        // 5<=4 -> false
        while(number <= 4){
            System.out.println(number);
            number++;
        }
        System.out.println("DONE");

    }
}



// for loop
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        for(int number=1;number <= 4;number++){
            System.out.println(number);
        }

        int number = 4;
        do{
            System.out.println(number);
            number++;
        }while(number <= 4);      

    }
}


// do while loop
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = 4;
        do{
            System.out.println(number);
            number++;
        }while(number <= 4);      

    }
}



//nested loop
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int lineNo = 3;
        
        // int number1 = 1;
        // while(number1 <= lineNo){
        //     System.out.print(number1);
        //     number1++;
        // }

        // System.out.println("\nNext Loop");

        int run = 1;
        while(run <= lineNo){

            int number1 = 1;
            while(number1 <= lineNo){
                System.out.print(number1);
                number1++;
            }
            
            System.out.println("");
            run++;
        }

      
    
    }
}



import java.util.Scanner;

class Main{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // // int num = sc.nextInt();
        
        // int run = 1;
        // while(run<=4){
            
        //     run++;
        // }

        for(int i=0;i<4;i++){
            // 1234
            int number = 1;
            while(number<=4){ //number<=4
                System.out.print(number);
                number++;
            }
            System.out.print("\n");
        }





        // do{
        //     System.out.println(number); //10
        //     number++; //10->11
        // }while(number<=4); //11<=4
        


        // // number2 = 1
        // // 1<=4 -> print -> 2
        // //2<=4 -> print -> 3
        // for(int number2 = 1;number2<=4;number2++){
        //     System.out.println(number2);
        // }

    
        
    }
}


import java.util.Scanner;

class Main{
    public static void main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // // int num = sc.nextInt();

        int number = 1;
        // 1<=4 -> yes -> print -> 2
        // 2<=4 -> yes -> print -> 3
        // 3<=4 -> yes -> print  -> 4
        // 4<=4  -> yes -> print -> 5
        // 5<=4
        // while(number<=4){
        //     System.out.println(number);
        //     number++;
        // }
        do{
            System.out.println(number);
            number++;
        }while(number<=4);
        
        // // number2 = 1
        // // 1<=4 -> print -> 2
        // //2<=4 -> print -> 3
        // for(int number2 = 1;number2<=4;number2++){
        //     System.out.println(number2);
        // }

    
        
    }
}
