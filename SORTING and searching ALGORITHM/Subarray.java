//print all subarray
public class Subarray {
    public static void subArray(int n[]){
        int ts=0;
        for(int i=0;i<n.length;i++){
            int start=i;
        for(int j=i;j<n.length;j++){
            int end =j;
            
        for(int k=start;k<=end;k++){
            System.out.print(n[k]+" ");
            
        }

    System.out.println();
    ts++;
    }
    System.out.println();
}
System.out.println(ts);//total subArrays
    }
    public static void main(String[] args){
int[] a={2,4,6,8,10};
subArray(a);
    }
    
}
