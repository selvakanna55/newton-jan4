package Assignments;

public class SmallerElements {
    static int smallerElements(int arr[], int n, int k){
        int l = 0, r = n-1, ans = n;
        while(l<=r){
            int mid = (l+r)/2;
            // if(arr[mid]==k) return mid; // found
            if(arr[mid]<=k){
                l = mid+1;
            }else{
                r = mid-1;
                ans = mid;
            }
        }
        return ans;
    }
}
