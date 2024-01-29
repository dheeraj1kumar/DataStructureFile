package searching;

public class linearSearch {
    public static int linearsearch(int a[], int key) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {

                return i;

            }
        }
        return -1;
    }

    





    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 8 };
        int res = linearsearch(arr, 70);
        if (res > 0)
            System.out.println("key is index:" + res);
        else
            System.out.println("key not found in array");
    }

}



