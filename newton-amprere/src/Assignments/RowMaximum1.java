package Assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RowMaximum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int ansIndex = -1;
        int numberOfOnes = 0;


        // T: O(rows*columns)
        // S: O(1)
        for (int i = 0; i < rows; i++) {
            int currOne = 0; // in this row, lets count ones
            for (int j = 0; j < columns; j++) {
                int temp = sc.nextInt();
                if (temp == 1) {
                    currOne++;
                }
            }
            // currOne will have total number of ones in curr row
            if (numberOfOnes < currOne) {
                ansIndex = i;
                numberOfOnes = currOne;
            }
            if (numberOfOnes == columns) break;
        }
        System.out.println(ansIndex);

    }
}