package Mid_term;

public class linkedlist {

    static class Node {
        int data;
        Node next;
        Node head;
        Node tail;

        Node(int data) {
            this.data = data;
            next = null;

        }
    }

    static Node head = null;
    static Node tail = null;

    public static void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;

        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
        }

        Node newNode = new Node(data);
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public Node deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");

        }

        Node temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static Node deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return head;
        }

        if (head.next == null) {
            Node temp = head;
            head = head.next;
            return temp;
        }

        Node current = head;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }

        prev.next = null;
        return current;

    }

    public void deleteLoc(int ind) {
        if (ind == 1) {
            head = head.next;
        } else {
            Node prev = head;
            int i = 1;
            while (i < ind - 1) {
                prev = prev.next;
                i++;
            }

            Node current = prev.next;
            prev.next = current.next;
        }

    }

    public static void printl() {
        if (head == null) {
            System.out.println("Linked list empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -->");
            temp = temp.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public void findAt(int i) {
        Node p = head;
        int count = 1;
        while (count < i) {
            p = p.next;
            count++;

        }
        System.out.println(p.data);
    }

    public int length() {
        Node p = head;
        int c = 0;
        while (p != null) {
            c++;
            p = p.next;
        }
        return c;
    }

    public int itrSearch(int key) {

        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                // key found
                return i;
            }

            temp = temp.next;
            i++;
        }
        // key not found
        return -1;
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();

        l.addFirst(2);

        l.addFirst(1);

        l.addLast(4);

        l.addLast(5);

        l.addMiddle(2, 3);

        l.printl();
        l.deleteFirst();
        l.printl();
        l.deleteLast();
        l.printl();
        System.out.println(l.length());

    }
}
