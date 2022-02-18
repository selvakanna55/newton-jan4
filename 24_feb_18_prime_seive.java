class Main{

    static void primeFactors(int n){
        // divide number by 2, as long as you can
        while(n%2==0){
            System.out.println(2);
            n = n/2;
        }

        // here n is odd
        for(int i=3;i<=Math.sqrt(n);i+=2){
           while(n%i==0){
               System.out.println(i);
               n = n/i;
           }
        }

        if(n>=2){
            // number is prime
            System.out.println(n);
        }
    }

    static void primeSieve(int n){
        boolean isPrime[] = new boolean[n+1]; 
        for(int i=0;i<=n;i++)
            isPrime[i] = true;
        isPrime[0] = isPrime[1] = false;

        // mark all multiples of 2 as not a prime
        for(int i=4;i<=n;i+=2) isPrime[i] = false;

        for(int i=3;i<=Math.sqrt(n);i+=2){
            if(isPrime[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        // T: O(log2 log2 n)
        // S : O(n)  -> bitset

        for(int i=0;i<=n;i++){
            if(isPrime[i]==true){
                System.out.println(i + "  Prime");
            }
            else{
                System.out.println(i + "  Not a Prime");
            }
        }

        // if any arr[i] is true then i is a prime number
        
    }
    

    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeSieve(n);
        System.out.println("End of program");
    }
}



import java.util.Scanner;

class Main{
    // sqrt(n)
   static boolean isPrimeOptimal2(int n){ 
        if(n==2) return true; // 2 is only even prime
        else if(n%2==0 || n<2) return false; // any other even is not primr
        for(int i=3;i<=Math.sqrt(n);i+=2){ // 3 , 5, 7, ...
            if(n%i==0) return false;
        }
        return true;
    }


    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // O(n)
        for(int i=0;i<=n;i++){
            
            if(isPrimeOptimal2(i)==true){
                System.out.println(i + "  Prime");
            }
            else{
                System.out.println(i + "  Not a Prime");
            }
            
        }


        System.out.println("End of program");
    }
}