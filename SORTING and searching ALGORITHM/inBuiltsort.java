
// import java.util.Arrays;

// public class inBuiltsort{
// public static void printarr(int a[]) {
//     for(int i=0;i<a.length;i++){
//         System.out.print(a[i]+" ");


//     }
// }

//  public static void main(String[] args) {
//     int[] a={2,1,4,0,3,5};
//     Arrays.sort(a);
//     printarr(a);
//  }   
// }




import java.util.Arrays;

public class inBuiltsort{
public static void printarr(int a[]) {
    for(int i=0;i<a.length;i++){
        System.out.print(a[i]+" ");


    }
}

 public static void main(String[] args) {
    int[] a={2,1,4,0,3,5};
    Arrays.sort(a,0,3);
    printarr(a);
 }   
}


/*
import java.util.Collection
Arrays.sort(a,Collection.reverseOrdered())  =in reversr order desending order
Arrays.sort(a,,si,ei,Collection.reverseOrdered()) 
 

use Ineger object
 */