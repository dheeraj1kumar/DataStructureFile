package Labexam;

public class l4 {
    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {

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
    }
}
