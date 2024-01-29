package Mid_term.End_term;

//level order and insert a data in a tree
import java.util.LinkedList;
import java.util.Queue;

public class t1 {
    static class Node {
        int key;
        Node left, right;

        Node(int key) {
            this.key = key;
            left = null;
            right = null;
        }
    }

    static Node root;
    static Node temp = root;

    static void printLevelOrder(Node temp) {
        int h = height(temp);
        int i;
        for (i = 1; i <= h; i++)
            printCurrentLevel(temp, i);
    }

    static int height(Node temp) {
        if (temp == null)
            return 0;
        else {
            int lheight = height(temp.left);
            int rheight = height(temp.right);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }

    static void printCurrentLevel(Node temp, int level) {
        if (temp == null)
            return;
        if (level == 1)
            System.out.print(temp.key + " ");
        else if (level > 1) {
            printCurrentLevel(temp.left, level - 1);
            printCurrentLevel(temp.right, level - 1);
        }
    }

    static void insert(Node temp, int key) {
        if (temp == null) {
            root = new Node(key);
            return;
        }
        Queue<Node> q = new LinkedList<Node>();
        q.add(temp);
        while (!q.isEmpty()) {
            temp = q.peek();
            q.remove();
            if (temp.left == null) {
                temp.left = new Node(key);
                break;
            } else
                q.add(temp.left);

            if (temp.right == null) {
                temp.right = new Node(key);
                break;
            } else
                q.add(temp.right);
        }
    }

    public static void main(String args[]) {
        root = new Node(10);
        root.left = new Node(11);
        root.left.left = new Node(7);
        root.right = new Node(9);
        root.right.left = new Node(15);
        root.right.right = new Node(8);
        /*
         * Inserting data from array
         * 
         * int a[] = {10,11,7,9,15,8};
         * root = new Node(10);
         * for(int i = 1;i<6;++i)
         * insert(root,a[i]);
         */
        System.out.print("Level order traversal before insertion:");
        printLevelOrder(root);

        int key = 12;
        insert(root, key);
        System.out.println();
        System.out.print("Level order traversal after insertion:");
        printLevelOrder(root);
        System.out.println("\nHeight:" + height(root));
    }
}