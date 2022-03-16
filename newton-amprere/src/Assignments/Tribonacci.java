package Assignments;


import java.util.Scanner;
class Tribonacci {

    private static int mod = 1000000007;
    private static long a, b, c;


    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        a = sc.nextLong();
        b = sc.nextLong();
        c = sc.nextLong();
        long[] dp = new long[n];
        dp[0] = a % mod;
        dp[1] = b % mod;
        dp[2] = c % mod;
        for (int i = 3; i < n; i++) {
            dp[i] = (dp[i - 1] % mod + dp[i - 2] % mod + dp[i - 3] % mod) % mod;
        }
        System.out.println(dp[n - 1]);
    }
}
