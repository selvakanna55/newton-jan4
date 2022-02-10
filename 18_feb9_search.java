import java.util.Scanner;

class Main{

  public static void main(String args[]){
     int arr[] = {1,3,4,7,9,11};

    int n = arr.length;
     int low = 0;
     int high = n-1;
     int target = 9;
    int ans = -1;

     while(low<=high){
       int mid = (low+high)/2;
       if(arr[mid]==target){
         ans = mid;
         break;
       }
       else if(target<arr[mid]){
         high = mid - 1;
       }
       else{
         low = mid+1;
       }
     }
    System.out.println(ans);
  

      System.out.println("End"); 
    }
}