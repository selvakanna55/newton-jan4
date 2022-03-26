package Assignments;

import java.util.Scanner;

public class FindPositionsOfXinArray {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for(int tc=0;tc<testcase;tc++){

            int n = sc.nextInt();
            int target = sc.nextInt();
            int arr[] = new int[n];

            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }

            boolean isTargetFound = false;
            for(int i=0;i<n;i++){
                if(arr[i]==target){
                    isTargetFound = true;
                    System.out.print(i+ " ");
                }

            }
            if(isTargetFound==false){
                System.out.print("Not found");
            }

            System.out.println();
        }
    }
}
