package Assignments;

import java.util.Scanner;

public class ModuloMultiplicativeInverse {
    public static void main (String[] args) {
        Scanner sc =  new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc>0){
            int a = sc.nextInt();
            int m = sc.nextInt();
            int ans = -1;
            for(int i=0;i<m;i++){
                if(( ( (a%m) * (i%m) ) %m) ==1){
                    ans = i;
                    break;
                }
            }
            System.out.println(ans);
            tc--;
        }
    }

}
