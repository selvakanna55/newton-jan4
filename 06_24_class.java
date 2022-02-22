import java.util.Scanner;

public class Main {

    void printWord(String word) {
        System.out.println(word);
    }

    void printNumber(int number) {
        //return 
        System.out.println(number);
    }

    boolean isEven(int number){
        if(number%2==0){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args){
        Main obj = new Main();

        String subject = "JAVA";
        obj.printWord(subject);
        obj.printNumber(11);

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        //check if number is even or odd
        for(int i=0;i<=number;i++){
            if(obj.isEven(i)){
                System.out.println(i+" EVEN");
            }
            else{
                System.out.println(1+" ODD");
            }
        }

    }

}


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework



class Main {


	public static void processNextNumber(int n, int b, Set<Integer> visited){
		visited.add(n);
		if(b>0){
			processNextNumber(n+3, b-1, visited);
			processNextNumber(n-3, b-1, visited);
			processNextNumber(n*2, b-1, visited);
		}		
	}
	

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase>0){
			int a = sc.nextInt();
			int b = sc.nextInt();
			Set<Integer> visited  = new HashSet<Integer>();
			visited.add(a);
			processNextNumber(a, b, visited);
			System.out.println(visited.size());
			testcase--;
		}

	}
}



int hcf(int n1, int n2) {
    if (n2 != 0)
        return hcf(n2, n1 % n2);
    else
        return n1;
}



class Solution{
    int gcd(int a, int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b); // 
    }

    int iterGCD(int a, int b){
        while(b>0){
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

    public void solve(){
        int a= 170;       
        int b= 17;       
        System.out.println(gcd(a,b));
    }
}


class Main{
    public static void main(String args[]){
        Solution solObj = new Solution();
        solObj.solve();
    }
}
