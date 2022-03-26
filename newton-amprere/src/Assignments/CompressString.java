package Assignments;

import java.util.Scanner;

public class CompressString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for(int tc=0;tc<testcases;tc++){
            String word = sc.next();
            char prev = word.charAt(0);
            int count = 1;
            StringBuffer ans = new StringBuffer();

            for(int i=1;i<word.length();i++){
                if(prev == word.charAt(i)){
                    count++;
                }else{
                    ans.append(prev);
                    ans.append(count);
                    prev = word.charAt(i);
                    count = 1;
                }
            }
            ans.append(prev);
            ans.append(count);
            System.out.println(ans);
        }
    }
}
