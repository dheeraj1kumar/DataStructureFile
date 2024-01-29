// public class cp268 {
//     public static int missing_num(int[] n){
//         int l=n.length;
//         int c=0;
//         for(int i=0;i<l;i++){
//             c+=1;
//             for(int j=0;j<l;j++){
                
//                 if(n[j]==c){
//                     return -1;
//                 }
//                 else if(n[j]!=c){
//                     return c;
//                 }
            

//                 }
//             }
//             return -1;
//         }
//         public static void main(String[] args) {
//             int[] n={1,0,3};
//             System.out.println(missing_num(n));
//         }
//     }
    

public class cp268 {
    public static int missing_num(int[] n){
       // int l=n.length;
        
    //    for(int i=0;i<l;i++){
            
      //  l=l^(n[i]^i);
      
      int n1=n.length,totalsum=n1*(n1+1)/2; //sum of first n natural numbers
      for(int i:n)
          totalsum-=i;
      return totalsum;
                
    
        
                
            
           // return l;
        }
        public static void main(String[] args) {
            int[] n={0,1,3};
            System.out.println(missing_num(n));
        }
    }