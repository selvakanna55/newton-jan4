package Assignments;


import java.util.*;
import java.io.*;

class MatrixZigzag {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < m; i++) { // row
            for (int j = i; j >= 0; j--) { // col
                if ((i - j) >= n) break;

                 System.out.print(arr[j][i-j]+" ");
            }
            System.out.println();
        }

        for (int i = 1; i < n; i++) { // col
            for (int j = m - 1; j >= 0; j--) { // row
                if ((i + (m - 1 - j)) >= n) break;
                System.out.print(arr[j][i + (m - 1 - j)] + " ");
            }
            System.out.println();
        }
    }
}