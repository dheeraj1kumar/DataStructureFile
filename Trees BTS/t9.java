//diameter of tree
//approach =1  ,O(N^2)

public class t9 {
  static class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;

    }

  }

  public static int height(Node root) {
    if (root == null) {
      return 0;
    }
    int lh = height(root.left);
    int rh = height(root.right);
    return Math.max(lh, rh) + 1;
  }

  public static int diameter(Node root) {// O(N^2)
    if (root == null) {
      return 0;
    }
    int ld = diameter(root.left);
    int lh = height(root.left);
    int rd = diameter(root.right);
    int rh = height(root.right);

    int selfdia = lh + rh + 1;

    return Math.max(selfdia, Math.max(ld, rd));
  }

  public static void main(String[] args) {
    /*
     * 1
     * / \
     * 2 3
     * / \ / \
     * 4 5 6 7
     */

    Node root = new Node(1);
    root.left = new Node(2);
    root.right = new Node(3);

    root.left.left = new Node(4);
    root.left.right = new Node(5);
    root.right.left = new Node(6);
    root.right.right = new Node(7);

    System.out.println(diameter(root));
  }
}

// Approach -2 O(n)
// public class t9{
// static class Node{
// int data;
// Node left;
// Node right;

// Node(int data){
// this.data=data;
// this.left=null;
// this.right=null;

// }

// }
// static class info{
// int diam;
// int ht;

// public info(int diam,int ht){
// this.diam=diam;
// this.ht=ht;
// }
// }

// public static info diameter(Node root){//O(n)

// if(root==null){
// return new info(0, 0);
// }
// info leftinfo=diameter(root.left);
// info rightinfo=diameter(root.right);

// int
// diam=Math.max(Math.max(leftinfo.diam,rightinfo.diam),leftinfo.ht+rightinfo.ht+1);
// int ht=Math.max(leftinfo.ht,rightinfo.ht)+1;

// return new info(diam,ht);
// }

// public static void main(String[] args) {
// /*
// 1
// / \
// 2 3
// / \ / \
// 4 5 6 7
// */

// Node root=new Node(1);
// root.left=new Node(2);
// root.right=new Node(3);

// root.left.left=new Node(4);
// root.left.right=new Node(5);
// root.right.left=new Node(6);
// root.right.right=new Node(7);

// System.out.println("Diameter of tree ="+diameter(root).diam);
// System.out.println("Height of tree ="+diameter(root).ht);

// }
// }