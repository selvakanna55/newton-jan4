import java.util.Scanner;


class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        // number = 1;
        // find sum till number (0+1+2+3)

        int sum = 0;
        // 1
        // number=3
        // i = 4
        // 4<=3 false for loop termanmites
        // n
        for(int i=1;i<=number;i++){ // (1+1)+(1+1)+(1+1)(1+)
                                    //  2 +2+2 + 1
                                    // 6 - > 2*n
                                    // 2n +1
            sum = sum + i; // 1+1+1 = 3 //n 
        }
        // 2n +1 + n+1 = 2+3n = 
        // ignore number
        // 3n
        // ignore constant
        // n



        // i=0  0<=5 sum =0  1
        // 1 1<=5 sum=1 2
        // 2 2<=5 sum=3 4
        //
        System.out.println(sum);

        // // n*(n+1)/2 -> sum of numbers
        // int ans2 = (number*(number+1))/2;
        // System.out.println(ans2);

        

        System.out.println("End of program");   


    }
}