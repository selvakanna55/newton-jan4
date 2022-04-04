package Assignments;


import java.util.*;
import java.io.*;
import java.lang.*;

class KthSmallestDiff {
    static int count(int arr[], int mid, int n) {
        int ans = 0;
        int j = 0;
        for (int i = 1; i < n; i++) {
            while (j < i && Math.abs(arr[i] - arr[j]) > mid) j++;
            ans += (i - j);
        }
        return ans;
    }

    static int small(int arr[], int k, int n) {
        Arrays.sort(arr);
        int l = 0, r = arr[n - 1] - arr[0];
        while (r > l) {
            int mid = (l + r) / 2;
            if (count(arr, mid, n) < k) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        while (tc > 0) {
            String num1[] = sc.nextLine().split(" ");
            int n = Integer.parseInt(num1[0]);
            int k = Integer.parseInt(num1[1]);

            String num2[] = sc.nextLine().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(num2[i]);

            System.out.println(small(arr, k, n));

            tc--;
        }

    }
}