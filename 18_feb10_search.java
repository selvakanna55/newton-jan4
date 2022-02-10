class Main{

    static int getIndex(int arr[], int target){

        int n = arr.length;
        int low = 0;
        int high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) low = mid+1;
            else high = mid-1;
        }
        return -1;

    }



    static int getIndexRec(int arr[], int target, int low, int high){
        if(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]<target) return  getIndexRec(arr, target, mid+1, high);
            else return getIndexRec(arr, target, low, mid-1);
        }
        return -1;
    }


    static int getIndexTernary(int arr[], int target){
        int n = arr.length;
        int low = 0;
        int high = n-1;
        while(low<=high){
            
            int m1 = low + (high-low)/3;
            int m2 = high - (high-low)/3;

            if(arr[m1]==target) return m1;
            if(arr[m2]==target) return m2;

            if(target<arr[m1]) high = m1-1;
            else if(target>arr[m2]) low = m2+1;
            else {
                low = m1+1;
                high = m2-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        int arr[] = {11,12,17,19,21,27};
        int target = 21;

        System.out.println(getIndexTernary(arr, target));
        System.out.println("End of program");
    }
}