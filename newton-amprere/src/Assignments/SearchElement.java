package Assignments;

public class SearchElement {
    static int isPresent(long arr[], int n, long k)
    {
        int l = 0, r = n-1;
        while(l<=r){
            int mid = (l+r)/2;
            if(arr[mid]==k){
                return 1;
            }
            else if(arr[mid]<k){
                l = mid+1;
            }
            else{
                r = mid-1;
            }
        }
        return -1;
    }
}
