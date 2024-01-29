/*Recursion:It is a method of solving a computional problem where the solution depends on solution to smaller
 instances of the same problem.

 Recurssive function called itself.
 *for factorial 
 f(n)=n*f(n-1)
 f(n-1)=(n-1)*f(n-2)
 f(n-2)=(n-2)*f(n-3)
      -
      -
      -
      1*f(0)


      main------->func----->fun----->fun----->

      1=base case
      2=kam
      3=inner function ko call karna

 */
//print number from n to 1:
// public class Re1 {
//     public static void printDec(int n){
//         if(n==1){
//         System.out.println(1);
//         return;
//         }
//         System.out.print(n+" ");
//         printDec(n-1);
//     }
//         public static void main(String[] args) {
//             int n=10;
//             printDec(n);
            
//         }
//     }



public class Re1 {
    public static void printInc(int n){
        if(n==1){
        System.out.print(n+" ");
        return;
        }
       // System.out.print(n+" ");
        printInc(n-1);
        System.out.print(n+" ");
    }
        public static void main(String[] args) {
            int n=10;
            printInc(n);
            
        }
    }

    

