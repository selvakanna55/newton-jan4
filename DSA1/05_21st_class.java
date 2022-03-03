// simple recursion call 
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}

class Solution{

    void function3(){
        System.out.println("F3 Start");
        System.out.println("F3 End"); 
    }

    void function2(){
        System.out.println("F2 Start");
        function3();
        System.out.println("F2 End"); 
    }
    void function1(){
        System.out.println("F1 Start");
        function2();
        System.out.println("F1 End");
    }
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        function1();
        System.out.println("END!!!");
    }
}



// sum of n
class Solution{

    int sumTillN(int n){
        if(n==0) {
            return 0;
        }
        else {
            return n+sumTillN(n-1);
        }
    }
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumTillN(n);
        System.out.println(sum);
    }
}



// factorial of n

class Solution{

    int factorial(int n){
        if(n==1) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }

}




