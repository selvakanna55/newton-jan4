package Assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AntiClockwise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // end col
        int m = n; // end row

        int arr[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int i = 0; //start row
        int j = 0; // start col

        while (i < m && j < n) {
            // left col
            for (int k = i; k < m; k++) {
                System.out.print(arr[k][j] + " ");
            }
            j++;

            // bottom row
            for (int k = j; k < n; k++) {
                System.out.print(arr[m - 1][k] + " ");
            }
            m--;

            //right col
            for (int k = m - 1; k >= i; k--) {
                System.out.print(arr[k][n - 1] + " ");
            }
            n--;

            // top row
            for (int k = n - 1; k >= j; k--) {
                System.out.print(arr[i][k] + " ");
            }
            i++;
        }

    }
}