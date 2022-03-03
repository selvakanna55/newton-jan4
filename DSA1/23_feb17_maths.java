import java.util.*;

class Main{

    int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, (a%b));
    }

    int lcm(int a, int b){
        return (a*b)/gcd(a,b);
    }

    void printDivisors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){ // n is divisble by i or not
                System.out.println(i);
            }
        }
    }

    void printDivisorsSqrt(int n){
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                System.out.println(i);
                if((n/i)!=i)
                    System.out.println(n/i);
            }
        }
    }



    boolean isPrime(int n){
        for(int i=2;i<n;i++){
            if(n%i==0) return false;
        }
        return true;
    }

    boolean isPrimeOptimal1(int n){
        for(int i=2;i<=Math.sqrt(n);i+=2){
            if(n%i==0) return false;
        }
        return true;
    }
    // sqrt(n)
    boolean isPrimeOptimal2(int n){ 
        if(n==2) return true; // 2 is only even prime
        else if(n%2==0) return false; // any other even is not primr
        for(int i=3;i<=Math.sqrt(n);i+=2){ // 3 , 5, 7, ...
            if(n%i==0) return false;
        }
        return true;
    }
    
    public static void main(String args[]){
        // Main mainObj = new Main(); // creating object
        // Scanner sc = new Scanner(System.in);
        // int number = sc.nextInt();
        // boolean res = mainObj.isPrimeOptimal(number);
        // if(res==true){
        //     System.out.println("Prime");
        // }else{
        //     System.out.println("Not a Prime");
        // }
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

    }
}