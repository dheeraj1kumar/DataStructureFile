import java.util.Arrays;

public class cpA{
    public static void merge(int a1[],int b1[]){
   int s=a1.length+b1.length;
int[] c=new int[s];
  int p=0;
        for(int i:a1){
            c[p]=i;
p++;
        }
        for(int i:b1){
c[p]=i;
       p++;  
       


    }
    System.out.println(Arrays.toString(c));

}

 public static void main(String[] args) {
        int[] a={1,2,3,4};
        int[] b={5,6,7};
        merge(a, b);
    }
    
}
