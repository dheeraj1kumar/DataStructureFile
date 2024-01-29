import java.util.Arrays;

public class BinarySearch {// binary search applied for sorted arrays if element not sort then first sort
  public static int binarySearch(int n[], int k) {
    int start = 0;
    int end = n.length - 1;
    while (start <= end) {
      int mid = (end + start) / 2;
      if (n[mid] == k) {
        return mid;

      } else if (n[mid] < k) {
        start = mid + 1;
      } else {
        end = mid - 1;
      }
    }
    return -1;

  }

  public static void main(String[] args) {
    int[] a = { 4, 6, 7, 8, 9, 76, 12 };
    Arrays.sort(a);
    int k = 4;
    int result = binarySearch(a, k);
    if (result == -1) {
      System.out.println("Element not found");
    } else {
      System.out.println("elemrnt found at position " + result);
    }
  }

}
