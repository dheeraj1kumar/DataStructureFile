// build binary search tree 

public class t15 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
            // right subtree
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void Inorder(Node root) {// o(n)
        if (root == null) {
            return;
        }

        Inorder(root.left);
        System.out.print(root.data + " ");

        Inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = { 100, 20, 500, 30, 40 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);

        }
        Inorder(root);
    }
}

// h.w 1-10 create bst and transverse