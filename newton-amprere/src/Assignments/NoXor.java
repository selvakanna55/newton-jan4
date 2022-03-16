package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class NoXor {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = 0;
        long sum = 0;
        long arr[] = new long[n+1];
        for(int i=1;i<=n;i++){
            // num = sc.nextInt();
            // sum += (n-i) ^ num;
            arr[i] = sc.nextInt();
            sum += (n-i) ^ arr[i];
        }
        System.out.println(sum);
    }
}