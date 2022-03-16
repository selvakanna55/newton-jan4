package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaximiumAndMinimum {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ///calculate sum of array
        int testcases = sc.nextInt();

        for(int tc=0;tc<testcases;tc++){

            int n = sc.nextInt();

            int arr[] = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            int maximum = Integer.MIN_VALUE;

            for(int i=0;i<n;i++){
                if(maximum<arr[i]){
                    maximum = arr[i];
                }
            }


            int minimum = arr[0];

            for(int i=0;i<n;i++){
                if(minimum>arr[i]){
                    minimum = arr[i];
                }
            }

            System.out.println(maximum + " "+minimum);
        }


    }
}