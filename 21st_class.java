
// sum of n
class Solution{

    int sumTillN(int n){
        if(n==0) {
            return 0;
        }
        else {
            return n+sumTillN(n-1);
        }
    }
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = sumTillN(n);
        System.out.println(sum);
    }
}



// factorial of n

class Solution{

    int factorial(int n){
        if(n==1) {
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = factorial(n);
        System.out.println(fact);
    }

}




