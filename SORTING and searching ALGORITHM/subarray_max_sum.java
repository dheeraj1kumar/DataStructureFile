//1(Brute Force)
//find max sum of sub array

// public class subarray_max_sum {
//     public static void subArray(int n[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;
//         for(int i=0;i<n.length;i++){
//             int start=i;
//         for(int j=i;j<n.length;j++){
//             int end =j;
//             currSum=0;

//         for(int k=start;k<=end;k++){
//             //System.out.print(n[k]+" ");
//             //sum subarray
//             currSum+=n[k];
//         }

//     System.out.println(currSum);
//     if(maxSum<currSum){
//         maxSum=currSum;
//     }
//     }

// }
// System.out.println("Max sum= " +maxSum);
//     }
//     public static void main(String[] args){
// int[] a={2,4,6,8,10};
// subArray(a);
//     }

// }

//max Subarray sum
// prefix array
//p[i-1]=a[i]

// public class subarray_max_sum {
//     public static void subArray(int n[]){
//         int currSum=0;
//         int maxSum=Integer.MIN_VALUE;

//         int prefix[]=new int[n.length];
//         prefix[0]=n[0];
//         //calculate the prefix array
//         for(int i=1;i<prefix.length;i++){
//             prefix[i]=prefix[i-1]+n[i];
//         }
//         for(int i=0;i<n.length;i++){
//             int start=i;
//         for(int j=i;j<n.length;j++){
//             int end =j;

//             currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

//     if(maxSum<currSum){
//         maxSum=currSum;
//     }
//     }

// }
// System.out.println("Max sum= " +maxSum);
//     }
//     public static void main(String[] args){
// int[] a={1,-2,6,-1,3};
// subArray(a);
//     }

// }

//Max subarray sum:
//Kadanes
public class subarray_max_sum {
    public static void kadanes(int n[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;
        for (int i = 0; i < n.length; i++) {
            cs = cs + n[i];
            ms = Math.max(cs, ms);

            if (cs < 0)
                cs = 0;

            // ms=Math.max(cs, ms);}
        }

        System.out.println("max sub arary " + ms);
    }

    public static void main(String[] args) {
        int[] a = { -1 };
        kadanes(a);
    }

}

// class Solution {
// public int maxSubArray(int[] nums) {
// int n = nums.length;
// int max = Integer.MIN_VALUE, sum = 0;

// for(int i=0;i<n;i++){
// sum += nums[i];
// max = Math.max(sum,max);

// if(sum<0) sum = 0;
// }

// return max;
// }
// }