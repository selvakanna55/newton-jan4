import java.util.*;

public class Sorting {
    static  void bubbleSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
    }

    static  void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int hole = i;
            int currValue = arr[i];
           while(hole>0 && arr[hole-1]>currValue){
              arr[hole] = arr[hole-1];
                hole--;
            }
            arr[hole] = currValue;
        }
    }

    static void selectionSort(int arr[]){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int miniIndex = i;
            for(int j=i+1;j<n;j++){
                // any elements found minimum than my curr minimum
                if(arr[j]<arr[miniIndex]){
                    miniIndex = j;
                }
            }
            int temp = arr[miniIndex];
            arr[miniIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        int arr[] = {15,94,13,12,11};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}

