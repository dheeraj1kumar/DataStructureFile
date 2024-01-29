package Labexam;

public class l {
    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Bts {
        static int idx = -1;

        public static Node buildtree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildtree(nodes);
            newNode.right = buildtree(nodes);
            return newNode;
        }

        public static void Inorder(Node root) {// o(n)
            if (root == null) {
                return;
            }

            Inorder(root.left);
            System.out.print(root.data + " ");

            Inorder(root.right);
        }

        public static void Preorder(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(+root.data + " ");
            Preorder(root.left);
            Preorder(root.right);
        }

        public static void Postorder(Node root) {
            if (root == null) {
                return;
            }

            Preorder(root.left);
            Preorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        Bts b = new Bts();
        Node root = b.buildtree(nodes);
        // System.out.println(root.data);

        b.Inorder(root);

        b.Postorder(root);

        b.Preorder(root);

    }

}