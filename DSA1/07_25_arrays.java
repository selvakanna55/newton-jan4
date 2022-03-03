class Solution{
    public void solve(){
        // int arr[]; //declare
        // arr = new int[5]; // instantiation 
        // arr[0] = 10; // initializaion
        // System.out.println(arr[0]);

        
        int arr[]; // declare
        arr = new int[5]; // instantiation
        arr[0] = 10; // initializaion
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int arrNumbers[] = new int[100]; // declare && initializaion
        arrNumbers[10] = 101;

        int arrNumbers2[] = {1,2,3,4};


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}




class Solution{
    public void solve(){
        // int arr[]; //declare
        // arr = new int[5]; // instantiation 
        // arr[0] = 10; // initializaion
        // System.out.println(arr[0]);

        
        int arr[]; // declare
        arr = new int[5]; // instantiation
        arr[0] = 10; // initializaion
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        int arrNumbers[] = new int[100]; // declare && initializaion
        arrNumbers[10] = 101;

        int arrNumbers2[] = {1,2,3,4};
        
        int sizeOfArray = arr.length;

        // for(int i=0;i<sizeOfArray;i++){
        //     System.out.println(arr[i]);
        // }

        for(int k:arrNumbers2){
            System.out.println(k);
        }

        System.out.println("-------------------");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}




import java.util.Scanner;

class Solution{
    public void solve(){
        Scanner sc = new Scanner(System.in);
        // int arr[]; //declare
        // arr = new int[5]; // instantiation 
        // arr[0] = 10; // initializaion
        // System.out.println(arr[0]);

        // store 5 numbers
        int arr[]; // declare
        arr = new int[5]; // instantiation
        for(int i=0;i<5;i++){
            int userInput = sc.nextInt();
            arr[i] = userInput; 
        }
        // 0 -> 1001 -> 
        int userInput = sc.nextInt();
        // arr[5] = userInput; // 5544

        int newArrNumber[] = new int[6];
        for(int i=0;i<5;i++){
            newArrNumber[i] = arr[i];
        }
        newArrNumber[5] = userInput; 

        int sum = 0;
        for(int i=0;i<newArrNumber.length;i++){
           System.out.println(newArrNumber[i]);
        }
        


       
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}


import java.util.Scanner;

class Solution{
    boolean isEven(int number){
        return number%2==0 ? true:false;
    }
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};

        int sizeOfArray = arr.length;
        int ansArray[] = new int[sizeOfArray];

        int index = 0;
        for(int i=sizeOfArray-1;i>=0;i--){
            ansArray[index] = arr[i];
            index++;
        }

        for(int k:ansArray){
            System.out.println(k);
        }
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}




//  9, 10, 2, 6, 7, 12, 8, 1

//  12, 12, 12, 12, 12, 12, 8, 1



// 34, 8, 10, 3, 2, 80, 30, 33, 1

// 34, 33, 33, 33, 33, 33, 33, 1


// 1 2 3 4 5
// 5 5 5 5 5
