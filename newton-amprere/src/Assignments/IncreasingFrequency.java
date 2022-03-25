package Assignments;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class IncreasingFrequency {
    public static void main(String[] args) {
        int nums[] ={1, 1, 2, 2, 2 ,3 };
        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for(int i=0;i< nums.length;i++){
            if(hm.containsKey(nums[i])){
                int count = hm.get(nums[i]);
                hm.put(nums[i], count+1);

            }else{
                hm.put(nums[i], 1);
            }
        }
        System.out.println(hm);

    }
}
