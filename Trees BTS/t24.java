import java.util.*;

public class t24 {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data=data;
            this.left=this.right=null;
        }
    }
 public static void getInorder(Node root,ArrayList<Integer> arr){
    if(root==null){
        if(root==null){
            return;
        }
        getInorder(root.left, arr);
        arr.add(root.data);getInorder(root.right, arr);    }
 }

 public static Node mergeBSTs(Node root1,Node root2){
    //step 1
    ArrayList<Integer> arr1=new ArrayList<>();
    getInorder(root1, arr1);
 
    //step2
    ArrayList<Integer> arr2=new ArrayList<>();
    getInorder(root2, arr2);

    //merge

    ArrayList <Integer> finalArray=ArrayLists<>();
while(i<arr1.size()&&j<arr2.size){
    if(arr1.get(i) <= arr2.get(j);
    finalArr.add( arr1.get(i));
    i++;
}else{
    finalArr.add(arr2.get(j));
    j++;
}
finalArr.arr()

    public static void main(String[] args) {
        
        /*     2
         *    /  \
         *   1    4    BST1
         * 
         * 

         */

         Node root1=new Node(2);
         root1.left=new Node(1);
         root1.right=new Node(4);

         /*
          *    

          9
         / \
        3    12
          */
          Node root2=new Node(9);
          root2.left=new Node(3);
          root2.right=new Node(12);

          /*
           *            3
           *           /  \
           *          1     9
        *            \     / \
                       2   4  12    final=      BST 
           * 
           * 


           */

    }
    
}
