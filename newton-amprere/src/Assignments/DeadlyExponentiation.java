package Assignments;

import java.io.*; // for handling input/output
import java.util.*;


public class DeadlyExponentiation {

    static long powRec(long a, long b, long c) { // logn
        long ans = 1;
        while (b > 0) {
            if ((b & 1) == 1) {
                ans = (ans * a) % c;
            }
            a = (a * a) % c;
            b >>= 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long mod = 1000000007;
        // long pow1 =  ;
        // long pow3 =  ;
        System.out.println(powRec(a, powRec(b, powRec(c, d, mod), mod - 1), mod));
        //61218255
        //322269119
    }
}

