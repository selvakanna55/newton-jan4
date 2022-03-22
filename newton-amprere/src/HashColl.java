import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class HashColl {
    static int hashFunction(int num){
        int index = num%7;
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {1,7,9,17,12};

        int HT[] = new int[7];
        HT[0]  = 1;
        //put
        for(int j=0;j<arr.length;j++){
            int num = arr[j];

            int i =0;
            int index = hashFunction(num)+i;
            while(HT[index]!=0) {
                i++;
                index = index + (int)(Math.pow(2,i));
            }
            HT[index] = num;
        }

        //querying or GET
        int index = hashFunction(7);
        int i = 0;
        while(HT[index]!=7) {
            i++;
            index = index + (int)(Math.pow(2,i));
        }

        if(HT[index]==7){ //HT[5]
            System.out.println("7 is present");
        }else{
            System.out.println("7 is not present");
        }

        index = hashFunction(10);
        i = 0;
        int htLen = HT.length;
        while(index<htLen && HT[index]!=7) {
            i++;
            index = index + (int)(Math.pow(2,i));
        }

        if(index<HT.length && HT[index]==10){ // O(1)
            System.out.println("10 is present");
        }else{
            System.out.println("10 is not present");
        }



    }
}
