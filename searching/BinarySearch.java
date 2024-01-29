package searching;

import java.util.*;

public class BinarySearch {

    public static int binarySearch(int a[], int key) {
        Arrays.sort(a);
        int l = 0;
        int e = a.length - 1;

        while (l <= e) {
            int m = l + (e - l) / 2;
            if (a[m] == key) {
                return m;
            } else if (a[m] > key) {
                e = m - 1;

            } else {
                l = m + 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 70, 8 };
        int k = 70;
        int res = binarySearch(arr, 70);
        if (res > 0)
            System.out.println("key is index:" + res);
        else
            System.out.println("key not found in array");
    }

}
