package Assignments;

import java.util.Scanner;

public class SimpleColors {
    public static void main (String[] args) {
        long ans = 0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        ans = k;
        for(int i=1;i<n;i++){
            ans = ans*(k-1);
            ans =  ans%1000000007;
        }
        System.out.println(ans);
    }
}
