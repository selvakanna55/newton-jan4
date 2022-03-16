import java.util.Scanner;

public class StringsClass {

    static int binarySearch(int arr[], int n, int target){
        int left = 0;
        int right = n-1;

        while(left<=right){
            int mid = (left+right)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) left = mid+1;
            else right = mid-1;
        }
        return  -1; // -1 means not found
    }

    public static void main(String[] args) {
        int sum = 5;
        int i = 1;
        for( ; i < 4; )
        {
            for(int j = 1; j < 4; )
            {
                for(int k = 1; k < 4; k++)
                {
                    sum = (i * j);
                    i++;
                    j++;
                    k++;
                }
            }
        }
        System.out.println("Sum = " + sum);

    }
}
