// create object
class Solution{
    int addTwoNumbers(int a, int b){
        int sum = a+b;
        return sum;
    }
    public void solve(){
        System.out.println("From new class");
        int valueA = 10;
        int valueB = 20;
        int sum = addTwoNumbers(valueA,valueB);
        System.out.println(sum);
    }
}

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}







//exception handling
import java.util.Scanner;
class Solution{
    void checkPrice(int price) throws ArithmeticException{
        if(price<0)
            throw new ArithmeticException("Price "+price+" cannot be less than 0");
        System.out.println("Price "+price+" is valid. storing data into DB");
    }

    public void solve(){
        Scanner sc = new Scanner(System.in);
        int valA = sc.nextInt();
        int valB = sc.nextInt();

        // perform division
        try{
            int divVal = valA/valB;
            System.out.println("Div: "+divVal);
        }catch(ArithmeticException e){
            System.out.println("Exception raised in division, proceeding to next lines");
        }

        //perform additon
        int addVal = valA+valB;
        System.out.println("Add: "+addVal);

        int price = sc.nextInt();
        checkPrice(price);
    }
}

class Main{
    public static void main(String args[]){
        Solution sol = new Solution();
        sol.solve();
    }
}








//