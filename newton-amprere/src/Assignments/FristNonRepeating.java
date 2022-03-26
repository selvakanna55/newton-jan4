package Assignments;

import java.util.Scanner;

public class FristNonRepeating {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int ht[] = new int[256];// 26
        String word = sc.next();

        for(int i=0;i<word.length();i++){
            int hashKey = (int)word.charAt(i);
            ht[hashKey]++;
        }
        //aabbccd
        // {a:2, b:2, c:2, d:1}
        int index = -1;
        for(int i=0;i<word.length();i++){
            int hashKey = (int)word.charAt(i);
            if(ht[hashKey]==1){
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
