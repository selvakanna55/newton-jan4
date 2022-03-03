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