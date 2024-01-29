
//Div-2 829



import java.util.Scanner;
public class B9 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            int s=sc.nextInt();

            char[] ch= sc.next().toCharArray();
            int q=0,a=0;
            for(int j=0;j<s;j++){
                if(ch[i]=='Q')
                q++;
                else q= Math.max(0,q-1);

            }
            if(q==0){
                System.out.println("yes");
            }
            System.out.println("No");
        }
    }
    
}






//codeforces 173 DIV-2
// import java.util.*;
// import java.util.Scanner;

// public class B9{
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);
//         int r=0;
//         int t=sc.nextInt();
  
        
        
//         while(t-->0){
// r+=sc.next().contains("+")?1:-1;
//         }
//         System.out.println(r);
//     }}











// 291 DIV-2
// import java.util.*;
// import java.util.Scanner;

// public class B9{
   
//     public static void main(String[] args) {
        
//         Scanner sc = new Scanner(System.in);

//       String s=sc.nextLine();
//         char[] ch= s.toCharArray();

//         for(int i=0;i<ch.length;i++){

//             if(ch[i]>'4' ){
//                 ch[i]= (char)('9'-ch[i] + '0');
//             }
//             if(ch[0]=='0'){
//                 ch[0]='9';
//             }
//         }
// System.out.println(ch);

//     }}