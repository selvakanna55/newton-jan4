package Assignments;

public class FirstTwo {
    static int firstTwo(int N){
//Enter your code here
        int rem, rev=0;
        while(N>99){
            N = N/10;
        }
        while(N>0){
            rem = N % 10;
            N = N/10;
            rev = rev*10+rem;
        }
        return rev;
    }
}

