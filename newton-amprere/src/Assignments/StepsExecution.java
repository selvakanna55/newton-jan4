package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class StepsExecution {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = (((n+8)/3)%5)*5;

        System.out.println(ans);
        // Your code here
    }
}