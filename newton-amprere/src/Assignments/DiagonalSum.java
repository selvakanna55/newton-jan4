package Assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DiagonalSum {
    static void printDiagonalSum(int arr[][], int n) {

        int diagonal1 = 0;
        for (int i = 0; i < n; i++) {
            diagonal1 += arr[i][i];
        }

        int diagonal2 = 0;
        int j = n - 1;
        for (int i = 0; i < n; i++) {
            diagonal2 += arr[i][j];
            j--;
        }
        System.out.println(diagonal1 + " " + diagonal2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        printDiagonalSum(arr, n);


    }
}