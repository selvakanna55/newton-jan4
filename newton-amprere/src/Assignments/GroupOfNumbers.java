package Assignments;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class GroupOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }

        ArrayList<Integer> li = new ArrayList<Integer>(hm.keySet());

        Collections.sort(li, (a, b) -> {
            if (hm.get(a) == hm.get(b)) {
                return b - a;
            } else {
                return hm.get(b) - hm.get(a);
            }
        });

        for (int i : li) {
            System.out.print(i + " ");
        }

    }
}