import java.util.ArrayList;
import java.util.HashSet;

public class HashColl {
    static  int hashFunction(int n){
        return n;
    }
    public static void main(String[] args) {
        int arr[] = {7,9, 11, 12, 4, 5};
        int hashTable[] = new int[20];
        for(int i=0;i<arr.length;i++){
            int num = arr[i];
            int idx = hashFunction(num);
            hashTable[idx] = i;
        }
        for(int i=0;i<hashTable.length;i++){
            System.out.println(i+"->"+hashTable[i]);
        }
        System.out.println();
        System.out.println("Is 10 present "+hashTable[10]);
        System.out.println("Is 15 present "+hashTable[15]);
        System.out.println("Is 7 present "+hashTable[11]);
    }
}
