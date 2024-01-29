/*Bubble sort:large elements come to the end of array by swapping with adjacent element
ex=5,4,1,3,2 
*/
public class BubbleSorting{

    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubbleSort(arr);
        printarr(arr);
    }
}