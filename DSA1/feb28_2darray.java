class Main{
    public void matrixMul(int matrix1[][], int matrix2[][]){
        int rows1 = matrix1.length;
        int columns1 = matrix1[0].length;

        int rows2 = matrix2.length;
        int columns2 = matrix2[0].length;

        if(columns1!=rows2){
            System.out.println("columns1 and rows2 should be same to perform multiplication");
            return;
        }
        //columns1==rows2
        int result[][] = new int[rows1][columns2];

        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns2;j++){
                for(int k=0;k<columns1;k++){
                    result[i][j] += (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }

        for(int i=0;i<rows1;i++){
            for(int j=0;j<columns2;j++){
                System.out.print(result[i][j] +" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){
        int matrix1[][] = {{4,6,3},{7,9,1},{9,6,2}};
        int matrix2[][] = {{3,7,8},{1,7,5},{11,9,6}};

        Main mainObj = new Main();
        mainObj.matrixMul(matrix1, matrix2);
    }
}


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc  = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int ansIndex = -1;
        int numberOfOnes = 0;


        // T: O(rows*columns)
        // S: O(1)
        for(int i=0;i<rows;i++){
            int currOne = 0; // in this row, lets count ones
            for(int j=0;j<columns;j++){
                int temp = sc.nextInt();
                if(temp==1){
                    currOne++;
                }
            }
            // currOne will have total number of ones in curr row
            if(numberOfOnes<currOne){
                ansIndex = i;
                numberOfOnes = currOne;
            }
            if(numberOfOnes==columns) break;
        }
        System.out.println(ansIndex);

    }
}


//https://leetcode.com/problems/search-a-2d-matrix/
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int columns = matrix[0].length;
        int i = 0, j = columns-1;
        
        while(i<rows && j>=0 ){
            if(matrix[i][j]==target) return true;
            // go down
            if(target>matrix[i][j])i++;
            else j--;
        }
        return false;
    }
}