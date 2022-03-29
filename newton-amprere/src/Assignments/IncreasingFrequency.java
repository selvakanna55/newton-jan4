package Assignments;

import java.lang.reflect.Array;
import java.util.*;

public class IncreasingFrequency {
    public static void main(String[] args) {
        int nums[] ={1, 1, 2, 2, 2, 3 };
       Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
       for(int i=0;i<nums.length;i++){
           if(ht.containsKey(nums[i])){
                int count = ht.get(nums[i]);
                ht.put(nums[i], count+1);
           }else{
               ht.put(nums[i], 1);
           }
       }
        System.out.println(ht);
        System.out.println(ht.keySet());
        System.out.println(ht.values());

       // get keys into arr
        ArrayList<Integer> al = new ArrayList<Integer>();
        for(int k:ht.keySet()){
            al.add(k);
        }
        // [3,2,1]
        Collections.sort(al, (a,b)->{
            if(ht.get(a)==ht.get(b)){
                return b-a;
            }
            else{
                return ht.get(a)-ht.get(b);
            }
        });

        for(int k:al){
            for(int i=0;i<ht.get(k);i++){
                System.out.print(k+" ");
            }
        }
    }
}
