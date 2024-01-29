//find permutation

package Back_Tracking;

public class B3 {

    public static void findPermutation(String str, String ans) {
        // base case
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }

        // recursiion O(n*n!)
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);    
            // 'abcde'==> 'ab'+'de'='abde'
            String NewStr = str.substring(0, i) + str.substring(i + 1);
            findPermutation(NewStr, ans + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        findPermutation(str, "");
    }

}



/*
 class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[nums.length];
         recurPermute(nums,ds,ans,freq);
        return ans;
    }
    
    
    
private void recurPermute(int nums[], List<Integer> ds , List<List<Integer>> ans ,    boolean freq[] ){
    if(ds.size()==nums.length){
    ans.add(new ArrayList<>(ds));
        return;
}
    for(int i=0; i<nums.length;i++){
        if(!freq[i]){
            freq[i]= true;
            ds.add(nums[i]);
            recurPermute(nums,ds,ans,freq);
            ds.remove(ds.size()-1);
            freq[i] = false;
        }
    }}}
*/

/*1. First Approach :- Generating all permutations

Two Extra Data Structure Required To generate permutation
1. ArrayList<> subset //to store subset
2. boolean map[]   //this map will tell us which element is pick or not picked at that time

//Let's Understand
Example :- [1,2,3]

for make permutation we can pick one element from given three element
1. if we pick 1 mark in map true ,map[T,F,F] & subset[1]
2. if we pick 2 mark in map true , map[F,T,F] & subset[2]
3. if we pick 3 mark in map true , map[F,F,T] & subset[3]

now suppose we picked 1 so that our map is map[T,F,F] & subset[1], again for make permutation we can pick one element from 
given three element but this time we already picked 1 so we have only 2 elements remaining
1.if we pick 2 mark in map true, map[T,T,F] & subset[1,2]
2.if we pick 3 mark in map true, map[T,F,T] & subset[1,3]

now suppose we picked 2 so that our map is map[T,T,F] & subset[1,2], again for make permutation we can pick one element from 
given three element but this time we already picked1 & 2 so we have only 3 remaining
1.we picked 3 mark in map true, map[T,T,T] & subset[1,2,3]

When subset size equal to arra size store the subset into our final ans 
and same for remaining cases*/
