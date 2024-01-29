// import java.util.*;
// import java.util.LinkedList;

// public class c {
//     Node root;

//     private static class Node {
//         Node left, right;
//         int data;

//         Node(int d) {
//             data = d;
//             left = null;
//             right = null;
//         }
//     }

//     public void addInnLavel(int data) {
//         Node p = new Node(data);
//         if (root == null) {
//             root = p;
//             return;
//         }

//         Queue<Node> q = new LinkedList<>();
//         Node c = root;
//         q.offer(c);
//         boolean f = true;
//         while (f) {
//             c = q.poll();
//             if (c.left == null) {
//                 c.left = p;
//                 return;
//             } else if (c.right == null) {
//                 c.right = p;
//                 return;
//             } else {
//                 if (c.left != null) {
//                     q.offer(c.left);

//                 }
//                 if (c.right != null) {
//                     q.offer(c.right);
//                 }
//             }
//         }
//     }

//     public static void preOrder(Node p) {
//         if (p != null) {
//             System.out.println(p.data + " ");
//             inOrder(p.left);

//             inOrder(p.right);

//         }
//     }

//     public static void inOrder(Node p) {
//         if (p != null) {
//             inOrder(p.left);
//             System.out.println(p.data + " ");

//             inOrder(p.right);

//         }
//     }
//     // public void inOrderWithout() {
//     // Stack<Node> s=new Stack<>();
//     // Node p=root;

//     // }

//     public void preeOrderWithoutRecursion() {
//         Stack<Node> s = new Stack<>();
//         Node c = root;
//         boolean f = true;
//         while (f) {
//             if (c != null) {
//                 s.push(c);

//                 System.out.println(c.data + " ");
//                 c = c.left;
//             } else {
//                 if (s.empty()) {
//                     f = false;
//                 } else {
//                     c = s.pop();
//                     c = c.right;
//                 }
//             }
//         }
//     }

//     public static void main(String[] args) {
//         c t = new c();
//         t.addInnLavel(10);
//         t.addInnLavel(20);
//         t.addInnLavel(30);
//         t.addInnLavel(40);
//         t.addInnLavel(50);
//         t.addInnLavel(60);
//         inOrder(t.root);

//         int[] arr = { 1, 21, 32, 32, 43, 4, 5 }; // adding value in a tree through array
//         for (int i = 0; i < arr.length; i++) {
//             t.addInnLavel(arr[i]);

//         }
//         inOrder(t.root);

//     }

// }

import java.util.Stack;

// A binary tree node
class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    void preorderIterative() {
        preorderIterative(root);
    }

    // Iterative function to do Preorder
    // traversal of the tree
    void preorderIterative(Node node) {
        if (node == null) {
            return;
        }

        Stack<Node> st = new Stack<Node>();

        // Start from root node (set curr
        // node to root node)
        Node curr = node;

        // Run till stack is not empty or
        // current is not NULL
        while (curr != null || !st.isEmpty()) {

            // Print left children while exist
            // and keep pushing right into the
            // stack.
            while (curr != null) {
                System.out.print(curr.data + " ");

                if (curr.right != null)
                    st.push(curr.right);

                curr = curr.left;
            }

            // We reach when curr is NULL, so We
            // take out a right child from stack
            if (!st.isEmpty()) {
                curr = st.pop();
            }
        }
    }

    public static void inOrder(Node p) {
        if (p != null) {
            inOrder(p.left);
            System.out.println(p.data + " ");

            inOrder(p.right);

        }
    }
    // public void inOrderWithout() {
    // Stack<Node> s=new Stack<>();
    // Node p=root;

    // }

    // Driver code
    public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.left.left = new Node(70);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.left.left.right = new Node(80);

        tree.preorderIterative();
    }
}