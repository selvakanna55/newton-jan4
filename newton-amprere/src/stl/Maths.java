package stl;
//import java.lang.Math;

public class Maths {
    public static void main(String[] args) {
        // pow
        //2^3
        //2*2*2
        int power = (int) Math.pow(2, 3);
        System.out.println(power);

        // sqrt
        int sq = (int) Math.sqrt(4);
        System.out.println(sq);
        sq = (int) Math.sqrt(991);
        System.out.println(sq);

        // max
        // 10, 20
//        int a = 10, b = 20, ans;
//        if(a<b){
//            ans = b;
//        }else{
//            ans = a;
//        }
//        System.out.println(ans);
        System.out.println(Math.max(10, 20));

        // maximum of 3 number
        int a = 10, b = 20, c = 30;
        int maxi1 = Math.max(a, b); //20
        int maxi2 = Math.max(maxi1, c);
        System.out.println(maxi2);

        System.out.println(Math.max(Math.max(a, b), c));

        //10.4
        // a, b
        //10/4 -> 2.5
        // 2
        // 3
        int x  = 10, y = 4;
        double ans = (double) x/ (double) y;
        System.out.println(10.0/4);
        System.out.println(Math.ceil(10.0/4));
        System.out.println(Math.floor(ans));
        System.out.println(Math.abs(-99));
        System.out.println(Math.abs(9));

    }
}
