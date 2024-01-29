/*selection sort=  pick the smallest (from unsorted), put it at the beginning */




public class selectionSort {
    public static void selectionsSort(int a[]){
        for(int i=0;i<a.length;i++){
            int minPos=i;
            for(int j=i+1;j<a.length;j++){
                if(a[minPos]>a[j]){
                    minPos=j;
                }
            }
            int temp=a[minPos];
            a[minPos]=a[i];
            a[i]=temp;
        
        
    }
    

    }
    /**
     * @param a
     */
    public static void pri(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
    } 


    /**
     * @param args
     */
    public static void main(String[] args) {
        int[] a={5,7,3,9,211};
        selectionsSort(a);
     pri(a);
    }
    
}
