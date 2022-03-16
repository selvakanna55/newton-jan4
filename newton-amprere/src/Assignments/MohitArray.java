package Assignments;


import java.util.Scanner;
class MohitArray
{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int xor = 0;
        for(int i=1;i<=n;i++){
            xor=xor^i;
        }

        for (int i=1;i<=n-1;i++){
            xor=xor^sc.nextInt();
        }

        System.out.print(xor);
        // Your code here
    }
}