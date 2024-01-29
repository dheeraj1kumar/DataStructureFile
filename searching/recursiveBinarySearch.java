package searching;

import java.util.*;

public class recursiveBinarySearch {

    public static int binarySearch(int a[], int l, int e, int key) {
        if (e >= 0) {
            return -1;
        }
        Arrays.sort(a);
        l = 0;
        e = a.length - 1;

        while (l <= e) {
            int m = l + (e - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] > key) {
                return binarySearch(a, l, m - 1, key);
            } else {
                return binarySearch(a, m + 1, e, key);

            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 70, 8 };
        int i = 0;
        int k = 70;
        int n = arr.length - 1;
        int res = binarySearch(arr, i, n, k);
        if (res > 0)
            System.out.println("key is index:" + res);
        else
            System.out.println("key not found in array");
    }

}
