package Assignments;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();

        long  sum = 0;
        for(int i=0;i<num.length();i++){
            sum  = sum + (num.charAt(i)-'0');
        }
        if(sum%3==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
