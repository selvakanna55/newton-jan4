package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaxDifference {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<n;i++) arr[i] = sc.nextInt();

        int maxDiff = -1;
        // for(int i=0;i<n;i++){
        //     for(int j=n-1;j>i;j--){
        //         if(arr[j]>arr[i] && maxDiff<(j-i)){
        //             maxDiff = j-i;
        //             break;
        //         }
        //     }
        // }

        int maxArray[] = new int[n];
        maxArray[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--){
            maxArray[i] = Math.max(arr[i], maxArray[i+1]);
        }

        int i = 0, j = 0;
        while(i<n && j<n){
            if(arr[i]<maxArray[j]){
                maxDiff = Math.max(j-i, maxDiff);
                j++;
            }else{
                i++;
            }
        }

        System.out.println(maxDiff);
    }
}