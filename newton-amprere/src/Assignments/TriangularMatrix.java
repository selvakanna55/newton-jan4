package Assignments;


import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0, sum2 = 0;
        //upper tirangle
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum1 += arr[i][j];
            }
        }

        //lower tirangle
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                sum2 += arr[i][j];
            }
        }


        System.out.println(sum1 + " " + sum2);
    }
}

