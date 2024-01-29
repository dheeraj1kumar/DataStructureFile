//fibonacci  of nth term


public class re4 {
    public static int fib(int n){
        if(n==0||n==1){
            return n;
        }
        int fnm1=fib(n-1);
        int fnm2=fib(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n=20;
        System.out.print(fib(n)+" ");
    }

    
}
