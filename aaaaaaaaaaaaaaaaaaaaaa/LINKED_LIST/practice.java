// import java.util.ArrayList;
// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         List <String> str=new ArrayList<String>();
//         str.add("hello how are you");
//         System.out.println(str);
//         // char ch=char.valueOf()
//         //  str="Hello world how are you";
//         // for(int i=0;i<str.size();i++){
//         //     System.out.print(str.get(i));
//         // }
//         for(int i=0;i<str.size();i++){
//               String a=str.get(i);
//               String s="";
//             for(int j=a.length()-1;j>=0;j--){
//                 if(a.charAt(j)==32)
//                       break;
//                 s=s+a.charAt(j);
//             }
//             System.out.println(s.length());
//         }

//         }
//     }



// import java.util.ArrayList;
// import java.util.*;

// public class practice {
//     public static void main(String[] args) {
//         String str="hello how are you";

//         char[] ch = new char[str.length()];
//         // System.out.println(ch);
//         List<String> list = new ArrayList<String>();
//         list=str;
//         // for(int i=0;i<str.length();i++){
//             for(int i=str.length()-1;i>=0;i--){
//                 // char [] s=.charAt(i);
//             // String s=str.charAt(i);
//             System.out.print(str.charAt(i));
//             System.out.println(str[i].length());
//             // String s = Character.toString(i);

//             // System.out.println(str[i].length());
//             if(str.charAt(i)==32){
//                 break;
//             }
//             // System.out.println(str.length());
//             // System.out.println(ch[i]);
//         }

        // for(int i=0;i<str.length();i++){
        // for(int i=str.length()-1;i>=0;i--){
        //     // if(str.charAt(i)==32){
        //     //     break;
        //     // }
        //     ch[i] = str.charAt(i);
        //     System.out.println(ch);

        // }
        // for(int i=str.length()-1;i>=0;i--){
        //     for(int j=str[i].length;j>=0;j++){
        //         System.out.println(str[i].length);
        //     }
            // System.out.println(i);

        
        // }
    // }
    


    public class practice{
        public static void main(String[] args) {
            String str="hello world how are you";
            String[] arr=str.split(" ");
            for(int i=arr.length-1;i>1;i--){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[0]);
        }
    }



// import java.util.Arrays;
// public class practice {
//     public static void main(String[] args) {
//         int a[]={1,21,4,2,3,2};
//         Arrays.sort(a);
//         int count=0;
//         int k=2;
//         for(int i=0;i<a.length;i++){
//                 //  if(a[i]==a[i+1]){
//                 //     System.out.println(a[i]);
//                 //     break;
//                 // }
//             System.out.print(a[i]+" ");
//             if(count==k){
//                 System.out.println(a[count]);
//             }
//             // else if(count<k && a[i]==a[i+1]){
                
//             //     System.out.println(a[count]);
//             // }
//             // else if(count<k){
//             //     System.out.println(a[k-1]);
//             // }
//             count++;

//             // for(int j=0;j<a.length;j++){
           
//             }
//             // count++;
           
//         }
//         }



    

