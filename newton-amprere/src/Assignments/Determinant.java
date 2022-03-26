package Assignments;

import java.util.Scanner;

public class Determinant {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = 2;
        int colums = 2;
        // int n =5;
        // int arr[] = new int[n];
        int matrix[][] = new int[rows][colums];

        // read input as 2D array
        for(int i=0;i<rows;i++){
            for(int j=0;j<colums;j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        //deter
        int ans = (matrix[0][0] *matrix[1][1]) - (matrix[0][1]*matrix[1][0]);
        System.out.println(ans);

    }
}
