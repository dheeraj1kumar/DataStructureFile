public class sum_subarrays {
    
    public static void subArray(int n[]){
        int currSum=0;
        int p=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<n.length;i++){
            int start=i;
        for(int j=i;j<n.length;j++){
           int end =j;
            currSum=0;
            
       for(int k=start;k<=end;k++){
           // System.out.print(n[k]+" ");
            //sum subarray
           currSum+=n[k];
           // System.out.println(n[k]+"="+currSum);
           
           
        }

   System.out.println("\n \t"+currSum);
    }
}


    }
    public static void main(String[] args){
int[] a={-2,1,-3,4,-1,2,1,-5,4};
subArray(a);
    }
    
}




// public class A
// {
//      void showA()
//     {
//         System.out.println(" DNA class method");
//     }
// }
// class B extends A
// {
//     void showB()
//     {
//         System.out.println("b class method");
//     }

//     public static void main(String[] args) {
//         A obj=new A();
//         obj.showA();
//        // obj.showB();//not call b class method through a class object


//         B ob2=new B();
//      ob2.showB();
//        ob2.showA();
//    }
// }