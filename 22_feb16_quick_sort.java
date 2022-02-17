import java.util.Arrays;

class Main{
    void swap(int arr[], int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    int doPartition(int arr[], int l, int r){
        int pivotValue = arr[l];
        int i = l, j = r;
        while(i<j){
            // as long curr value of i is smaller or equal procedd (i++)
            while(i<r && arr[i]<=pivotValue) i++;
            // curr value of j is bigger than pivotValue j--;
            while(j>=l && arr[j]>pivotValue) j--;
            // arr[i] and arr[j] they are in the wrong side
            // arr[i]>pivotValue arr[j]<=pivotValue
            if(i<j) swap(arr, i, j);
        }
        // move pivot to center
        swap(arr, j, l);
        return j;
    }


    void quickSort(int arr[], int l, int r){
        if(l<r){
            int pivotIndex = doPartition(arr, l, r);
            quickSort(arr, l, pivotIndex);
            quickSort(arr, pivotIndex+1, r);
        }
    }

    public static void main(String args[]){
        Main m = new Main();
        int arr[] = {7,4,16, 17, 8, 11, 13, 15};
        int n = arr.length;
        m.quickSort(arr, 0, n-1);
        System.out.println(Arrays.toString(arr));

    }
}