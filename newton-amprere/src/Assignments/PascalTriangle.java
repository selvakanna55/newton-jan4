package Assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class  PascalTriangle{

    static long factorial(int n){
        int mod = 1000000007;
        long ans = 1;
        for(long i=1;i<=n;i++){
            ans = (ans*i)%1000000007;
        }
        return ans;
    }
    public static void main (String[] args) {
        int mod = 1000000007;
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        long arr[][] = new long[n+1][n+1];
        arr[0][0] = 1;
        long nFact  = factorial(n);

        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    arr[i][j] = 1;
                }else{
                    arr[i][j] = (arr[i-1][j] + arr[i-1][j-1])%1000000007;
                }
            }
        }
        for(int i=0;i<=n;i++){
            System.out.print(arr[n][i]+" ");
        }
        // System.out.println();
        // for(int i=0;i<=n;i++){
        // 	// ncr
        // 	long ans = nFact / ((factorial(n-i) * factorial(i))%mod);
        // 	// MMI
        // 	System.out.print(ans+" ");
        // }

    }
}