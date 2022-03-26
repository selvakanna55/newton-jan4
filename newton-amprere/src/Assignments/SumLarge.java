package Assignments;

import java.util.Scanner;

public class SumLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int asize = a.length();
        int bsize = b.length();
        int i = asize-1;
        int j = bsize-1;
        int carry = 0;
        StringBuffer sbf = new StringBuffer();

        while(i>=0 || j>=0 || carry>0){
            int num1 = 0, num2 = 0;
            if(i>=0){
                num1 = a.charAt(i)-'0';
            }
            if(j>=0){
                num2 = b.charAt(j)-'0';
            }
            int sum = num1 + num2 + carry;
            sbf.append(sum%10);
            carry = sum/10;
            j--;
            i--;
        }
        System.out.println(sbf.reverse());

    }
}
