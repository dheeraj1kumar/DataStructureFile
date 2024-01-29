//Transversal of tree: 1--> Inorder

public class t3{
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

        static class BTS{
            static int idx=-1;
            public static  Node buildTree(int nodes[]){
             idx++;
             if(nodes[idx]==-1){
                return null;
             }
             Node newNode=new Node(nodes[idx]);
             newNode.left=buildTree(nodes);
             newNode.right=buildTree(nodes);
            
            return newNode;


        }
    public static void Inorder(Node root){//o(n)
        if(root==null){
            return;
        }
        
        Inorder(root.left);
        System.out.print(root.data+" ");

        Inorder(root.right);
    }
    
    
    
    }

        public static void main(String[] args) {
            int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

            BTS b=new BTS();
            Node root=b.buildTree(nodes);
          //  System.out.println(root.data);
            b.Inorder(root);
        }
    }