public class power_of_2_or_not {
public static boolean isPowerOfTwo(int n){
    return (n&(n-1))==0;
}


    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(11));
    }
    
}
