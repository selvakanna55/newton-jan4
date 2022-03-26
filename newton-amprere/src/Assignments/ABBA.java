package Assignments;

import java.util.Scanner;

public class ABBA {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String word = sc.next();
        int a = 0, b = 0;
        for(int i=0;i<n;i++){
            if(word.charAt(i)=='a'){
                a++;
            }
            else{
                b++;
            }
        }
        int ans = Math.min(a, b);
        System.out.println(ans);
    }
}
