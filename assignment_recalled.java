//donation
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int maxi = sc.nextInt();   // frist payment 
                System.out.print(0 + " ");

                long sum = maxi;
                for(int i=1;i<n;i++){
                        int currAmount = sc.nextInt();
                        if(currAmount>=maxi){
                                System.out.print(0 + " ");
                        }
                        else{
                                System.out.print(maxi-currAmount + " ");
                                sum +=(maxi-currAmount);
                        }

                        maxi = Math.max(maxi, currAmount);
                        sum += currAmount;
                }
                System.out.println();
                System.out.println(sum);
                      // Your code here
    }
}


//maximum diff in array
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = sc.nextInt();


        int maxDiff = -1;

        // for(int i=0;i<n;i++){
        //     for(int j=0;j<n;j++){
        //         if(arr[j]>arr[i] && (j-i) > maxDiff){
        //             maxDiff = j-i;
        //         }
        //     }
        // }

        int maxArray[] = new int[n];
        maxArray[n-1] = arr[n-1];

        for(int i=n-2;i>=0;i--){
            maxArray[i] = Math.max(arr[i],maxArray[i+1]);
        }

        for(int i=0, j=0; i<n && j<n;){
            if(arr[i]<maxArray[j]){
                if( j-i > maxDiff)
                    maxDiff = j-i;
                j++;
            }
            else{
                i++;
            }
        }

		System.out.println(maxDiff);

		

	}
}



//xor

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long num = 0;
        long sum = 0;
        long arr[] = new long[n+1];
        for(int i=1;i<=n;i++){
            // num = sc.nextInt();
            // sum += (n-i) ^ num;
            arr[i] = sc.nextInt();
            sum += (n-i) ^ arr[i];
        }
        System.out.println(sum);
    }
}

//pair
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        long arr[] = new long[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
         
         Arrays.sort(arr);

         long result = 0;

         int l = 0, r = n-1;
         while(l<r){
            result = Math.max(result,arr[l++]+arr[r--]);
         }

         System.out.println(result);                
    }
}