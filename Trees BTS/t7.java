//count the number of nodes

public class t7{
    static class Node{
        int data;
        Node left;
        Node right;
        
        Node(int data){
                this.data=data;
                this.left=null;
                this.right=null;

            }
        
        }
        public static int count(Node root){
            if(root==null){
                return 0;
            }
            int lc=count(root.left);
            int rc=count(root.right);
            return (lc+rc)+1;
        }
        public static void main(String[] args) {
            /*
              1
             / \
            2  3
          / \    \
        4    5    6
             */

             Node root=new Node(1);
           root.left=new Node(1);
            root.right=new Node(1);

             root.left.left=new Node(1);
             root.left.right=new Node(1);
             //root.right.left=new Node(1);
             root.right.right=new Node(1);

System.out.println(count(root));
        }
        }