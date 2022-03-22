public class ArrayTwo {
    static void play(){
        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        //2D array
        int matrix[][] = new int[5][5];
        matrix[0][0] = 100;
        matrix[0][1] = 10;
        matrix[0][2] = 20;
        matrix[0][3] = 30;
        matrix[0][4] = 40;
        matrix[1][0] = 50;
        matrix[1][1] = 60;
        matrix[1][3] = 70;
        matrix[1][4] = 80;
        matrix[1][2] =94;

        for(int row=0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                System.out.print(matrix[row][col]+" ");
            }
            System.out.println();
        }
    }
    static void doMatrixAddition(){
        int m1[][] = {{10, 20, 30}, {40, 50, 60},{70, 80, 90}};
        int m2[][] = {{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        int rows = m1.length;
        int columns = m1[0].length;
        int result[][] = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                result[i][j] = m1[i][j] + m2[i][j];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    static  void doMatrixMultiplication(){
        int m1[][] = {{3,4}, {5,6}};
        int m2[][] = {{2,1}, {3,4}};

        int rows = m1.length;
        int columns = m1[0].length;
        int result[][] = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                int sum = 0;
                for(int k=0;k<columns;k++){
                    sum+=m1[i][k] * m2[k][j];
                }
                result[i][j] = sum;
                System.out.print(sum+" ");
            }
            System.out.println();
        }
     }
    public static void main(String[] args) {
        doMatrixMultiplication();
    }
}
