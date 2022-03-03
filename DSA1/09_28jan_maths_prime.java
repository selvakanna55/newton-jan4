//prime seive 

import java.util.Scanner;

class Solution{
   
    int hcf(int a, int b){
        if(b==0){
            return a;
        }
        return hcf(b, a%b);
    }
    // a*b = LCM(a,b) * HCF(a,b)
    // LCM = a*b/hcf(a,b)
    

// 1, itself 
// even prime number = 2
// odd prime number

// multiple of 2 and it is not 2 then false

// i from 3 to sqrt(n)  incr by +2
// if num%i == 0 false

// true
    boolean isPrime(int number){
        if(number == 2) return true;
        else if(number%2==0) return false;
        else
            for(int i=3;i*i<=number;i+=2) // O(sqrt(n)) 
                if(number%i==0) return false;
        return true; // only for prime numbers
    }

    

    public void solve(){
       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
       boolean isNumPrime[] = new boolean[n+1]; 
       // assume all number is prime
       for(int i=0;i<=n;i++){
           isNumPrime[i] = true;
       }
       isNumPrime[0] = false;
       isNumPrime[1] = false;

       for(int i=2;i<=Math.sqrt(n);i++){
           if(isNumPrime[i]){ // if current number is prime

                //mark all multiples as not a prime
                for(int j=i+i;j<=n;j+=i){
                    isNumPrime[j] = false;
                }
           }
       }
       // space -> O(n)
       // time O(N*log(log(N)))

       for(int i=0;i<=n;i++){
           if(isNumPrime[i]==true)
                System.out.println(i+" Prime");
       }
       

      
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}



//array diff - assignment
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
        //     for(int j=i+1;j<n;j++){
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
