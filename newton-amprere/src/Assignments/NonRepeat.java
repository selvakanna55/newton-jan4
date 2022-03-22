package Assignments;

import java.util.HashMap;

public class NonRepeat {
    public static void main(String[] args) {
        String word = "newtonschool";
        HashMap<Character, Integer> ht = new HashMap<Character, Integer>();
        for(int i=0;i<word.length();i++){
            if(ht.containsKey(word.charAt(i))){
                ht.put(word.charAt(i), ht.get(word.charAt(i))+1);
            }else{
                ht.put(word.charAt(i), 1);
            }
        }
        int index = -1;
        for(int i=0;i<word.length();i++){
            if(ht.get(word.charAt(i))==1){
                index = i;
                break;
            }
        }
        System.out.println(index);


    }
}


