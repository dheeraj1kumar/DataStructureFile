package Mid_term.End_term;

//traversal in tree inorder preorder postorder
class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    BinaryTree() {
        root = null;
    }

    void printInorder(Node node) {
        if (node == null)
            return;
        printInorder(node.left);
        System.out.print(node.key + " ");
        printInorder(node.right);
    }

    void printPreorder(Node node)

    {
        if (node == null)
            return;
        System.out.print(node.key + " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }

    void printPostorder(Node node) {
        if (node == null)
            return;
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key + " ");
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(25);
        tree.root.left = new Node(15);
        tree.root.right = new Node(50);
        tree.root.left.left = new Node(10);
        tree.root.left.right = new Node(22);
        tree.root.right.left = new Node(35);
        tree.root.right.right = new Node(70);
        tree.root.left.left.left = new Node(4);
        tree.root.left.left.right = new Node(12);
        tree.root.left.right.left = new Node(18);
        tree.root.left.right.right = new Node(24);
        tree.root.right.left.left = new Node(31);
        tree.root.right.left.right = new Node(44);
        tree.root.right.right.left = new Node(66);
        tree.root.right.right.right = new Node(90);

        System.out.print("\nInorder traversal of binary tree is ");
        tree.printInorder(tree.root);
        System.out.print("\nPreorder traversal of binary tree is ");
        tree.printPreorder(tree.root);
        System.out.print("\nPostorder traversal of binary tree is ");
        tree.printPostorder(tree.root);

    }
}
