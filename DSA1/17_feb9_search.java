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


// assignment 
//Pair Em Up
import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int arr[] = new int[n];

    for(int i=0;i<n;i++)
      arr[i] = sc.nextInt();

    Arrays.sort(arr);

    int low = 0;
    int high = n-1;
    int maxi = 0;

    while(low<high){
      int currSum = arr[low]+arr[high];
      if(maxi<currSum) maxi = currSum;
      low++;
      high--;
    }

     System.out.println(maxi);        
  }
}