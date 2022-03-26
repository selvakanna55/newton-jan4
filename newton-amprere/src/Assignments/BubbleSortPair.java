package Assignments;

class Pair {
    int x;
    int y;

    // Constructor
    public Pair(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
}

public class BubbleSortPair {

    static Pair[] SortPair(Pair arr[], int n)  {

        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j].x<arr[j+1].x){
                    Pair temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                if(arr[j].x==arr[j+1].x && arr[j].y<arr[j+1].y){
                    Pair temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        return arr;
        //enter your code here
    }
}
