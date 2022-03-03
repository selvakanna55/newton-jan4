import java.util.*;

class Main{
    static int fact(int n, int mod){
        // 5! => 1*2*3*4*5
        int ans = 1;
        for(int i=1;i<=n;i++){
            ans = (ans *i)%mod;
        }
        return ans;
    }

    static int powRec(int a, int b, int mod){
        if(b==0) return 1;
        int ans = powRec(a,b/2, mod);
        if(b%2==0)  // case of even
            return (ans*ans)%mod;
        else // case of odd
            // return a*ans*ans;
            return ((a*ans)%mod*ans)%mod;
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int mod = 11;
        //n! / (n-r)!*r! => nCr
        int ans1  = fact(n, mod); // n!
        int ans2 = fact(n-r, mod)*fact(r, mod); // (n-r)!*r!
        //mmi of ans2
        // ans2 inverse
        ans2 = powRec(ans2, mod-2, mod);
        // int finalAns = (ans1/ans2);
        int finalAns = (ans1*ans2)%mod;
        System.out.println(finalAns);
    }
}

