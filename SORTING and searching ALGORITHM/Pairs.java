//Pairs in an array

public class Pairs {
public static void printPairs(int n[]){
    int tp=0;
    for(int i=0;i<n.length;i++){
        int curr=n[i];
        for(int j=i+1;j<n.length;j++){
            System.out.print("(" + curr + "," +n[j]+ ")");
            tp++;
        }
    
    System.out.println();
    }
    System.out.println("total number of pairs:"+tp);//tp=n(n-1)/2
}
public static void main(String[] args) {
        int[] t={2,4,6,8,10};
        printPairs(t);
    }
    
}


