package Assignments;

import java.util.Scanner;

public class Flames {
    public static void main(String[] args)
    {
        Scanner Sc= new Scanner(System.in);
        String string1=Sc.next();
        String string2=Sc.next();
        int arr1[]=new int[26];
        for(int i=0;i<string1.length();i++)
        {
            int idx=string1.charAt(i)-'a';
            arr1[idx]=arr1[idx]+1;
        }
        int arr2[]=new int[26];
        for(int i=0;i<string2.length();i++)
        {
            int idx=string2.charAt(i)-'a';
            arr2[idx]=arr2[idx]+1;
        }
        int sum=0;
        for(int i=0;i<arr1.length;i++)
        {

            sum=sum+Math.abs(arr1[i]-arr2[i]);
        }
        String res[]={"Siblings","Friends","Love","Affection","Marriage","Enemy"};
        System.out.print(res[sum%6]);
    }

}
