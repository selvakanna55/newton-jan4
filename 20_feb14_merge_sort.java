import java.util.Arrays;

class Main{

   

   

    static int[] mergeTwoArrays(int arr1[], int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int newLength = n+m;
        int result [] = new int[newLength];

        int i = 0, j = 0, k = 0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                result[k] = arr1[i];
                i = i+1;
                // result[k++]=arr[i++];
            }
            else {
                result[k] = arr2[j];
                j = j+1;
                // result[k++] = arr2[j++];
            }
            k = k+1;
        }
        while(i<n) result[k++]= arr1[i++];
        while(j<m) result[k++] = arr2[j++];
        return result;
    }

    static void mergeResult(int arr[], int l, int mid, int r){
        // finding the index range
        // calculate the size 
        int n1 = mid-l+1;
        int n2 = r-mid;

        // creation of arr1, arr2 based on n1, n2
        int temp1[] = new int[n1];
        int temp2[] = new int[n2];

        // copy into arr1, arr2 from arr3
        for(int i=0;i<n1;i++) temp1[i] = arr[l+i];
        for(int j=0;j<n2;j++) temp2[j] = arr[mid+j+1];      
        
        int i = 0, j = 0, k = l;
        while(i<n1 && j<n2){
            if(temp1[i]<temp2[j]) arr[k++] = temp1[i++];
            else arr[k++] = temp2[j++];
        }
        while(i<n1)  arr[k++] = temp1[i++];
        while(j<n2) arr[k++] = temp2[j++];        
    }
    
    // divide , divde and merge the results
    static void sortArray(int arr[], int l, int r){
        if(l<r){
            int mid = (l+r)/2;
            // left half 
            sortArray(arr, l, mid);
            //right half
            sortArray(arr, mid+1, r);
            // merge the results
            mergeResult(arr, l, mid, r);            
        }
    }


      public static void main(String args[]){ 
        int arr3[] = {29, 21, 19, 4};
        int n = arr3.length;
        // int arr4[] = {1,3,17,25,33,99, 107,1001, 5005};
        // int arr5[] = mergeTwoArrays(arr3, arr4);
        // for(int i=0;i<arr5.length;i++)
        //     System.out.print(arr5[i]+ " ");
        sortArray(arr3, 0, n-1);
        // for(int i:arr5)
        //     System.out.print(i+ " ");
        System.out.println(Arrays.toString(arr3));

        System.out.println("End of program");
    }
}