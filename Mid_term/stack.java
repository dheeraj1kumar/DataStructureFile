package Mid_term;

// import java.util.*;

// class stack {
//     static int s[];
//     static int top;
//     static int max;

//     stack(int size) {
//         s = new int[size];
//         max = size;
//         top = -1;

//     }

//     public void push(int data) {
//         if (top == max - 1) {
//             System.out.println("Stack is overflow");
//         } else {
//             System.out.println("Push eelment" + data);
//             s[++top] = data;

//         }
//     }

//     public int pop() {
//         if (top == -1) {
//             System.out.println("Stack is underflow");

//         } else {
//             System.out.println("pop element");

//         }
//         return s[top--];
//     }

//     public int peek() {
//         if (top == -1) {
//             System.out.println("Stack is empty");
//         }
//         return s[top];

//     }

//     // some extra method:
//     public int getsize() {
//         return top + 1;
//     }

//     public boolean isEmpty() {
//         return top == -1;
//     }

//     public boolean isFull() {
//         return top == max - 1;
//     }

//     public void display() {
//         if (isEmpty()) {
//             System.out.println("stack is empty");

//         } else {
//             for (int i = 0; i <= top; i++) {
//                 System.out.println(s[i] + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         stack st = new stack(10);
//         st.push(1);
//         st.push(2);
//         st.push(3);
//         st.display();

//         st.pop();

//         st.display();

//         System.out.println("peek element " + st.peek());
//     }
// }

//Using linkedList
public class stack {

    static class Node {
        static int data;
        static Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node top = null;

    public static boolean isEmpty() {
        return top == null;
    }

    public static void push(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            System.out.println("Stack is empty");
            top = newNode;
            return;
        }

        newNode.next = top;
        top = newNode;
    }

    public static int pop() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }
        int top1 = top.data;
        top = top.next;
        return top1;
    }

    public static int peek() {

        if (isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        return top.data;
    }

    public static void main(String[] args) {
        stack st = new stack();
        st.push(1);
        st.push(2);
        st.push(3);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }

}
