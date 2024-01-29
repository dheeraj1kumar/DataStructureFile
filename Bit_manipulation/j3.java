import java.util.*;

// class j3{
//     public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
//         List<String>list=new ArrayList<>();
//         int sumIndices=0;
//         for(int i=0;i<k;i++){
//             sumIndices=sumIndices+1;
//         }
//         for(int i=0;i<nums.size();i++){
//             list.add(Integer.toBinaryString(i));
//         }
//         int sum=0;
//         for(int i=0;i<list.size();i++){
//            // System.out.print(list.get(i)+" ");
//             int t=0;
//             for(int j=0;j<list.get(i).length();j++){
//                 if(list.get(i).charAt(j)==49){
//                     t++;
//                 }
//             }
//             if(t==sumIndices){
//                 sum+=nums.get(i);
//             }
            
//         }
//         return sum;
//     }
// }




class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
       int count = 0;
        int n=nums.size()-1;
        int s=0;
    for (int i = 0; i < n; i++)
    {
       
            
     count = countSetBits(nums.get(i));
                
 
            if (count == k)
               
                s+=nums.get(i);
             
        }
    
    return s;
        
    }
   public static int countSetBits(int n){
    int count = 0;
    while (n > 0)
    {
        n&= (n - 1);
        count++;
    }
    return count;
}
}

/*class Solution {
    public int sumIndicesWithKSetBits(List<Integer> nums, int k) {
        int ans=0;
        for(int i=0;i<nums.size();i++){
           
           if((countSetBits(i)==k)){
                System.out.println(nums.get(i));
               ans+=nums.get(i);
           }
        }
        return ans;
    }
   static int countSetBits(int n)
    {
        int count = 0;
        while (n > 0) {
            count+=n&1;
            n>>=1;
        }
        return count;
    }
} */