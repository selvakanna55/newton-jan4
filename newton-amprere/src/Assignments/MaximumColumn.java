package Assignments;


import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumColumn {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        long maxi = 0;
        for(int j=0;j<c;j++){
            long sum = 0;
            for(int i=0;i<r;i++){
                sum+=arr[i][j];
            }
            maxi = Math.max(sum, maxi);
        }


        System.out.println(maxi);
    }
}
