/*
Insertion sort=pick an element(from unsorted part) & place in the right pos in sorted part
 * 
*/
public class InsertionSort {

    public static void insertionSort(int a[]) {
        for (int i = 0; i < a.length; i++) {

            int curr = a[i];
            int prev = i - 1;
            while (prev >= 0 && a[prev] > curr) {
                a[prev + 1] = a[prev];
                prev--;
            }
            // insertion
            a[prev + 1] = curr;
        }
    }

    public static void pri(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] a = { 5, 7, 3, 9, 211, 4 };
        insertionSort(a);
        pri(a);
    }

}
