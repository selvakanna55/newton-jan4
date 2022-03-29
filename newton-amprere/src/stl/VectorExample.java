package stl;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Vector<Integer> nums = new Vector<Integer>();
        //creation of obj of vector
        // arr[0] = 10;
        nums.add(10); //0
        //arr[1] = 20;
        nums.add(20);
        nums.add(30);
//        System.out.println("before adding 99"+nums);
        nums.add(0, 99);
////        System.out.println("after adding 99"+nums);
////        //arr[0]
////        System.out.println(nums.elementAt(0));
////        System.out.println(nums.contains(10));
////        System.out.println(nums.contains(101));
//
        for(int i=0;i< nums.size();i++){
            System.out.print(nums.elementAt(i)+" ");
        }

        System.out.println();

        Iterator<Integer> it = nums.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }

        System.out.println();
        for(Iterator<Integer> it1 = nums.iterator();it1.hasNext();){
            System.out.print(it1.next()+" ");
        }

        System.out.println();
        Vector<Integer> p = new Vector<>();
        p.add(100);
        p.addAll(nums);
        System.out.println(p);




//        System.out.println(nums);
//        nums.remove(1);
//        System.out.println(nums);
//        nums.remove(nums.size()-1);
//        System.out.println(nums);
//        nums.remove(new Integer(99));
//        System.out.println(nums);



    }
}
