package Assignments;


import java.io.*;
import java.util.*;

class RotateMatrix {

    static void rotate90(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }


        for (int r = 0; r < n; r++) {
            int i = 0, j = n - 1;
            while (i < j) {
                int temp = arr[r][i];
                arr[r][i] = arr[r][j];
                arr[r][j] = temp;
                i++;
                j--;
            }
        }
        // print array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        // rotate90(arr, n);

        rotate90(arr, n);

        System.out.println();
        rotate90(arr, n);
    }
}
