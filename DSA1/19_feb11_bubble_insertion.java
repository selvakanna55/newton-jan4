class Main{

  static void bubbleSort(int arr[], int n){
        for(int i=0;i<n;i++){
          boolean isSwapped = false;
          // second for loop
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                      isSwapped = true;
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            // end of second for loop
            if(isSwapped==false) break;
        }
    }

  static void insertionSort(int arr[], int n){
    for(int i=0;i<n;i++){
      int currValue = arr[i];
      int hole = i;

      while(hole>=1 && arr[hole-1]>currValue){
        arr[hole] = arr[hole-1];
        hole--;
      }
      arr[hole] = currValue;
    }

  }

  public static void main(String args[]){
    System.out.println("Start");
    int arr[] = {11, 9, 8, 6, 101, 3, 1, -10, -99};
    int n = arr.length;
    insertionSort(arr, n);
    //print array
    for(int i=0;i<n;i++)
      System.out.print(arr[i]+ " ");
    System.out.println("End"); 
    }
}
