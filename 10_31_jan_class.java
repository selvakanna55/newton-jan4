//big integer
import java.util.Scanner;
import java.math.BigInteger;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}

class Solution{

    BigInteger factorial(int N)
	{
		BigInteger f = new BigInteger("1"); 
		for (int i = 2; i <= N; i++)
			f = f.multiply(BigInteger.valueOf(i));

		return f;
	}

    public void solve(){
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int a = 10;
        BigInteger b = BigInteger.valueOf(10);
        b  = new BigInteger("87");
        BigInteger c = BigInteger.TWO;

        int x   =  b.intValue();  
        long y   = b.longValue();
        String z = b.toString(); 

        int N = 22;
		System.out.println(b.add(c));
		System.out.println(b);
		System.out.println(factorial(N));


		double mm = 3/2;
		System.out.println(mm);
		System.out.println(7/2*3);
		System.out.println(3*7/2);

		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		int a1 = 100000;
		int b1 = 100000;
		long c1 = a1*1L*b1;
		System.out.println(c1);

		double d = Math.pow(10,2);
		System.out.println(String.format("%.20f", d));;
		// System.out.println(d);


		//int  -10^9  to 10^9
		//long  -10^18  to 10^18
    }
}



import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}


class Solution{

    
   int f(int a, int b){
       if(b==0) {
           return 1;
       }
       else if(b%2==0){
           return f(a,b/2)*f(a,b/2);
       }
       else{
           return a*f(a,b/2)*f(a,b/2);
       }
   }

   int pow(int a, int b){
       int res = 1;

       while(b>0){
           if(b%2==1){
               res = res*a;
           }

           a = a*a;
           b = b/2;
       }
       return res;
   }
   
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println(f(a,b));
        System.out.println(pow(a,b));
    }
}



// (a-b) %c = ((a%c - b%c )+ c)%c

// (a%c - b%c) + 0





import java.util.Scanner;
import java.math.BigInteger;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}

class Solution{
    int MOD  = 1000000007; //10^9 + 7
    // final ans should be mod 10^9 + 7
    // 1000000007

    // 5! = 5*4*3*2*1 = 120
    int  factorial(int n){
        int result = 1;

        for(int i=2;i<=n;i++)
            result = (result * i)%MOD; //0 to MOD-1

        return result; // 0 to 46
    }


    public void solve(){
        //given a number A ^ B find ans, 
        //finally print ans with MOD 10^9 + 7
        Scanner sc = new Scanner(System.in);

        int ans = 1;
        int a = 2;
        int b = 16; 
        // 170^107;
        for(int i=1;i<=b;i++){
            ans = (ans * a) % MOD;
        }
        //  O(b) 
   
        // double ans = Math.pow(170,107, mod); // double
        
        System.out.println(ans);

      
    }
}




import java.util.Scanner;
import java.math.BigInteger;
import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}

class Solution{
    long MOD  = 1000000007; 

    long power(long a, long b, long localMod){
        if(b==0){ // is b is 0
            return 1;
        }

        long res = power(a, b/2, localMod);
        System.out.println(res);
        
        if(b%2==0){ // even
            return (res * res)%localMod;
        }
        else{ // odd
            return ((a * res)%localMod * res)%localMod;
        }
    }


    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(power(a,b, MOD));

    }
}