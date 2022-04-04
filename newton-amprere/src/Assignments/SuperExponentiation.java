package Assignments;

import java.util.Scanner;

public class SuperExponentiation {
    static long powRec(long a, long b, long mod){
        if(b==0) return 1;
        long powerAns = powRec(a, b/2, mod);
        if(b%2==0){
            return (powerAns * powerAns)%mod;
        }
        else{
            return ((a*powerAns)%mod * powerAns)%mod;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long mod = 1000000007;
            long bPowC = powRec(b, c, mod-1);
            long ans = powRec(a, bPowC, mod);
            System.out.println(ans);
            tc--;
        }
    }
}
