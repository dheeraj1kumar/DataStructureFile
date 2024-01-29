package Mid_term.End_term.tree;

//Bst Binary search tree

public class Bst2 {
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

    public static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.left, key);
        }

    }

    public static void main(String[] args) {
        int values[] = { 5, 1, 3, 4, 2, 7 };
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);

        }
        Inorder(root);

        if (search(root, 6)) {
            System.out.print("found");
        } else {
            System.out.print("not found");
        }
    }
}
