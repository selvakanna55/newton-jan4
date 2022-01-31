import java.util.Scanner;

class Solution{
    int hcf(int a, int b){
        if(b==0){
            return a;
        }
        return hcf(b, a%b);
    }
    

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
        else{
            for(int i=3;i*i<=number;i+=2){
                if(number%i==0) return false;
            }
        }
        return true; // only for prime numbers
    }
    public void solve(){
        System.out.println(isPrime(10)? "10 Prime":"10 Not Prime");
        System.out.println(isPrime(12)? "12 Prime":"12 Not Prime");
        System.out.println(isPrime(17)? "17 Prime":"17 Not Prime");
        System.out.println(isPrime(37)? "37 Prime":"37 Not Prime");
        System.out.println(isPrime(9)? "9 Prime":"9 Not Prime");
        System.out.println(isPrime(3)? "3 Prime":"3 Not Prime");
        
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}




import java.util.Scanner;

class Solution{
    int hcf(int a, int b){
        if(b==0){
            return a;
        }
        return hcf(b, a%b);
    }

    public void solve(){
        int number = 36;

        for(int i=1;i*i<=number;i++){ // i=1; i<=sqrt(n)
            if(number%i==0){ 
                System.out.println(i);
                System.out.println(number/i);
            }
        }
        // 36%2 == 0 ? 2 , 36/2 =? 18
        
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}

import java.util.Scanner;

class Solution{
    int hcf(int a, int b){
        if(b==0){
            return a;
        }
        return hcf(b, a%b);
    }

    public void solve(){
        Scanner sc = new Scanner(System.in);
        int arr[] = {2,4,6,8,10,20};

        // hcf(hcf(hcf(hcf(2),4),6).8)
        int hcfAns = arr[0];
        int lcmAns = arr[0];
        for(int i=1;i<arr.length;i++){
            hcfAns = hcf(hcfAns, arr[i]);
            lcmAns = (lcmAns*arr[i])/hcf(lcmAns,arr[i]);
        }
        System.out.println("HCF "+hcfAns);
        System.out.println("LCM "+lcmAns);



        // System.out.println("GCD "+hcf(a,b));
        // int mul = a*b;
        // int ans = mul/ hcf(a,b);
        // System.out.println("LCM "+ans); // l
        // // a*b = GCD(a,b) * LCM(a,b)
        // // a*b/GCD(a,b) = LCM(a,b);
        
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}






// hcf = 2,4,6,8
// -> hcf(2,4) -> 2
// hcf = 2,6,8
// hcf(2,6) -> 2
// hcf = 2,8
// hcf(2,8) -> 2
// hcf = 2



// hcf(hcf(hcf(hcf(2),4),6).8)





// 22 -> O(n)
// i from 1 to 22
// n%i==0, divisor 
// 1,2,11,22

// 30
// i from 1 to 30
// 1,2,3,5,6,10,15,30
// (1,30) (2,15) (3,10) (5,6)

// from 1 to sqrt(n)
// 30%1 == 0 -> 1 -> 30/1= 30 
// 30%2 == 0 -> 2  -> 30/2 = 15
// 30%3 = 0  -> 3 -> 30/3 = 10


// 36 -> 6 (1 to <=6) // sqrt(n) -> O(sqrt(n)) O(1)
// 1 -> 1,36 // 36%1 == 0  -> 36/1
// 2 -> 2, 18 // 36%2 == 0 -> 36 % (18)
// 3 -> 3, 12 // 36%3 == 0 -> 36/(36/3)
// 4 -> 4, 9
// 6 -> 6, 6

not needed as it is repeating
// 9 -> 9, 4
// 12 -> 12,3
// 18 -> 18,2
// 36 -> 36,1

// sqrt(nu) * sqrt(nu) = nu




// 1, itself 
// even prime number = 2
// odd prime number

// multiple of 2 and it is not 2 then false

// i from 3 to sqrt(n)  incr by +2
// if num%i == 0 false

// true






any number -> multiples of powers of prime
10 -> 2^1 * 5^1 
18 -> 2^1 *  3^2 -> 2,3,3

// print factors of number, where every factor should be prime number
// 12 -> 1,12, 2,6  3,4 

// 12 -> 2,2,3 -> 2,3
// 34 -> 2,17 -> 2,17



