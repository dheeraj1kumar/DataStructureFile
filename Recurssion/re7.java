//cal x^n o(n)

// public class re7 {

//     public static int power(int x,int n){
//         if(n==0){
//             return 1;
//         }
//         /*int xnm1=power(x,n-1);
//          * int xn = x* xnm1;
//          * return xn;
//           */

//           return x*power(x,n-1);
//     }
//     public static void main(String[] args) {
        
//         System.out.println(power(2, 10)); 
//     }
// }


//cal x^n with optimized
public class re7 {

    public static int optimizedpower(int x,int n){
        if(n==0){
            return 1;
        }
        
//int halfPowerSq= optimizedpower(x, n/2)*optimizedpower(x, n/2);
int halfPower= optimizedpower(x, n/2);
int halfPowerSq=halfPower*halfPower;

         // n is odd
         if(n%2!=0){
            halfPowerSq=x*halfPowerSq;
         } 
         return halfPowerSq;
    }
    public static void main(String[] args) {
        
        System.out.println(optimizedpower(2, 10)); 
    }
}
