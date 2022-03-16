package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class Donation {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        long sum = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        int maximumSoFar = arr[0];

        for(int i=0;i<n;i++){

            if(arr[i]<maximumSoFar){
                int diff = maximumSoFar-arr[i];
                System.out.print(diff+" ");
                sum+=diff;
            }
            else{
                System.out.print(0+" ");
                maximumSoFar = arr[i];
            }
        }
        System.out.println();
        System.out.print(sum);
    }
}
