package Assignments;

import java.util.Scanner;

public class InfinityStone {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String currState = sc.next();
        String code = sc.next();
        int ans = 0;

        for(int i=0;i<n;i++){
            int num1 = currState.charAt(i) - '0';
            int num2 = code.charAt(i) - '0';

            int forward = Math.abs(num1-num2);
            int backward = 10-forward;
            ans +=Math.min(forward, backward);
        }
        System.out.println(ans);

    }
}
