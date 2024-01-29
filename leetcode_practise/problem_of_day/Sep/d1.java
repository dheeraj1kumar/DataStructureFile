package leetcode_practise.problem_of_day.Sep;

public class d1 {
    public static void main(String[] args) {
        int p=5;
        System.out.println(d1.countBits(p));
    }
 
  
        public static int[] countBits(int n) {
            int [] ans=new int [n+1];
          
            for(int i=0;i<=n;i++){
               
              ans[i]=Bits(i);
                
            }
            return ans;
        }
        public static int Bits(int n){
            int c=0;
            while(n!=0){
                c+=(n&1);
                n=n>>1;
            }
            return c;
        }
    }



    /*
     class Solution {
    public int[] countBits(int n) {
       
        int t[]=new int[n+1];
        for(int i=0;i<=n;i++){
        int c=0;
       String  b=Integer.toBinaryString(i);
            for(int k=0;k<b.length();k++){
            if(b.charAt(k)==49)
                c++;
            
            }
                t[i]=c;
        }
        return t;
    }
}

     */