package Assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class PairEmUp {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);

        int low = 0;
        int high = n-1;
        int maxi = 0;

        while(low<high){
            int currSum = arr[low]+arr[high];
            if(maxi<currSum) maxi = currSum;
            low++;
            high--;
        }

        System.out.println(maxi);
    }
}
