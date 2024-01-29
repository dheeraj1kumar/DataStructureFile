import java.util.*;

public class Inorder_Traversal {
    static class TreeNode {
        TreeNode left;
        TreeNode right;
        int val;

        TreeNode(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (root == null) {
            return ans; // base condition

        }

        Stack<TreeNode> st = new Stack<>();

        TreeNode cur = root;
        while (cur != null || !st.isEmpty()) {
            while (cur != null) {
                st.add(cur);
                cur = cur.left;
            }
            cur = st.pop();
            ans.add(cur.val);
            cur = cur.right;
        }
        return ans;
    }

    public static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        if (root == null) {
            return ls;
        }
        stk.push(root);
        while (!stk.isEmpty()) {
            TreeNode cur = stk.pop();
            ls.add(0, cur.val);
            if (cur.left != null) {
                stk.push(cur.left);
            }
            if (cur.right != null) {
                stk.push(cur.right);
            }
        }
        return ls;
    }
    // public void preeOrderWithoutRecursion(TreeNode root) {
    // Stack<Node> s = new Stack<>();
    // TreeNode c = root;
    // boolean f = true;
    // while (f) {
    // if (c != null) {
    // s.push(c);

    // System.out.println(c.data + " ");
    // c = c.left;
    // } else {
    // if (s.empty()) {
    // f = false;
    // } else {
    // c = s.pop();
    // c = c.right;
    // }
    // }
    // }
    // }

    // method-2
    // public List<Integer> inorderTraversal(TreeNode root) {
    // ArrayList<Integer>al=new ArrayList<>();
    // Stack<TreeNode>stk=new Stack<>();
    // if(root==null){
    // return al;
    // }
    // while(!stk.isEmpty() || root!=null){
    // if(root!=null){
    // stk.push(root);
    // root=root.left;
    // }
    // else{
    // TreeNode n= stk.pop();
    // al.add(n.val);
    // root=n.right;
    // }
    // }
    // return al;
    // }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        System.out.println(inorderTraversal(root));
        System.out.println(postorderTraversal(root));
        // System.out.println(preeOrder);

    }

}
