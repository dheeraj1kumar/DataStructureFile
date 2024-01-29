import java.util.*;

public class Post_Order_Traversal {
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

    public static List<Integer> inorderTraversal(TreeNode root) {

        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (root == null)
            return ans; // base condition

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

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ls = new ArrayList<>();
        Stack<TreeNode> st = new Stack();
        if (root == null) {
            return ls;
        }
        st.push(root);
        while (!st.isEmpty()) {
            TreeNode n = st.pop();
            ls.add(n.val);
            if (n.right != null) {
                st.push(n.right);
            }
            if (n.left != null) {
                st.push(n.left);
            }
        }
        return ls;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);
        System.out.println(postorderTraversal(root));
        System.out.println(inorderTraversal(root));
        System.out.println(preorderTraversal(root));
    }

}