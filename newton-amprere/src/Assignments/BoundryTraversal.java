package Assignments;

import java.util.Scanner;

public class BoundryTraversal {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while(testcases>0){
            testcases--;

            int rows = sc.nextInt();
            int columns = sc.nextInt();

            int arr[][] = new int[rows][columns];
            // store input into arr
            for(int i=0;i<rows;i++){
                for(int j=0;j<columns;j++){
                    arr[i][j] = sc.nextInt();
                }
            }



            if(rows==1){
                for(int i=0;i<columns;i++){
                    System.out.print(arr[0][i]+" ");
                }
            }else if(columns==1){
                for(int i=0;i<rows;i++){
                    System.out.print(arr[i][0]+" ");
                }
            }else{
                // top row or frist row -> -> ->
                for(int i=0;i<columns;i++){
                    System.out.print(arr[0][i]+" ");
                }

                // last column -> increasing rows
                for(int i=1;i<rows-1;i++){
                    System.out.print(arr[i][columns-1]+" ");
                }

                // print array in reverse order
                // last row <- <- <- <-
                for(int i=columns-1;i>=0;i--){
                    System.out.print(arr[rows-1][i]+" ");
                }
                // first columns
                for(int i=rows-2;i>=1;i--){
                    System.out.print(arr[i][0]+" ");
                }
            }
            System.out.println();



        }
    }
}
