package stl;

import java.util.Vector;

public class TwoSUm {
//    for(int i=0;i< arr.length;i++){
//        for(int j=i+1;j<arr.length;j++){
//
//            if(arr[i]+arr[j]==k){
//                ans = true;
//                break;
//            }
//
//        }
//    }
    public static void main(String[] args) {
        boolean ans = false;
        int arr[] = {12,15,17,19,23};
        int k = 36;

        Vector<Integer> nums = new Vector<>();
        for(int i:arr){
            nums.add(i);
        }
        // [ 1, 2, 3, 4, 5]

        for(int i:arr){
            int x = i;
            int y = k-i;
            if(nums.contains(y)){
                System.out.println(x +" "+y);
                ans = true;
                break;
            }
        }




        System.out.println(ans);
    }
}
