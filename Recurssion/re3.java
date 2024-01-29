//sum of n natural number
public class re3 {
    public static int sum(int n){
        if(n==1){
            return 1;

        }
        int Snm1=sum(n-1);
        int sn=n+sum(n-1);
        return sn;

    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(sum(n));
    }
}