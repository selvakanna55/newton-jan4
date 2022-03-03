import java.util.*;

class Main{

    static int linearSearch(int arr[], int target,  int n){
        //liner search
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int arr[], int target, int n){
        int l = 0, r = n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) l = mid+1;
            else r = mid-1;
        }
        return -1;
    }

    public static void main(String args[]){
        int arr[] = {10, 20, 33, 11, 45, 66, 89, -5, -6};
        int n = arr.length;
        Arrays.sort(arr);
        String arrayString = Arrays.toString(arr);
        System.out.println("Sorgted Array : " + arrayString);
        int target = 88;
        int targetIndex = binarySearch(arr, target, n);
        System.out.println(targetIndex); 
    }
}