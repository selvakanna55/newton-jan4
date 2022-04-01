package stl;

import java.util.*;

public class HashMapExample {

    static void diffMaps(){
        HashMap<Integer, Integer> hm1 = new HashMap<>();
        TreeMap<Integer, Integer> hm2 = new TreeMap<>();
        LinkedHashMap<Integer, Integer> hm3 = new LinkedHashMap<>();

        hm1.put(10, 20);
        hm1.put(30, 40);
        hm1.put(50, 60);

        hm2.put(30, 40);
        hm2.put(10, 20);
        hm2.put(50, 60);

        hm3.put(50, 60);
        hm3.put(10, 20);
        hm3.put(30, 20);

        System.out.println(hm1);
        System.out.println(hm2);
        System.out.println(hm3);
    }
    public static void main(String[] args) {

        // students roll no, student mar k
        HashMap<Integer, Integer> studMark = new HashMap<>();
        studMark.put(10, 99);
        studMark.put(40, 91);
        studMark.put(11, 91);
        System.out.println(studMark);
        System.out.println(studMark.keySet());
        System.out.println(studMark.values());



//        for(Integer x:studMark.keySet()){
//            System.out.println(x+" "+studMark.get(x));
//        }

        Iterator<HashMap.Entry<Integer, Integer>> it = studMark.entrySet().iterator();
        while(it.hasNext()){
            HashMap.Entry<Integer, Integer> curr = it.next();
            System.out.println(curr.getKey() + " "+curr.getValue());
        }


//        System.out.println(studMark);
//        // update roll no 11 mark to 95
////        studMark.put(11, 95);
//        // more marks roll no 11 got is 4
//        int currMark = studMark.get(11);
//        studMark.put(11, currMark+4);
//        System.out.println(studMark);
//        System.out.println(studMark.get(10));




    }
}
