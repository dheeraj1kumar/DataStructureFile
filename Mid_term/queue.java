//using queue

package Mid_term;

// public class queue {
//     static int a[];
//     static int size;
//     static int rear;

//     queue(int n) {
//         a = new int[n];
//         size = n;
//         rear = -1;
//     }

//     public static boolean isEmpty() {
//         return rear == -1;
//     }

//     public static void enqueue(int data) {
//         if (rear == size - 1) {
//             System.out.println("queue is full");
//             return;
//         }
//         rear = rear + 1;
//         a[rear] = data;

//     }

//     public static int dequeue() {
//         if (isEmpty()) {
//             System.out.println("queue is empty");
//         }

//         int front = a[0];
//         for (int i = 0; i < rear; i++) {
//             a[i] = a[i + 1];
//         }
//         rear = rear - 1;
//         return front;
//     }

//     public static int peek() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");

//         }
//         return a[0];
//     }

//     public static void main(String[] args) {
//         queue q = new queue(5);
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         // 123
//         while (!isEmpty()) {
//             System.out.print(q.peek()+" ");
//             q.dequeue();
//         }
//     }
// }

//using linkedlist
// public class queue {
//     static class Node {
//         int data;
//         Node next;

//         Node(int data) {
//             this.data = data;
//             this.next = null;
//         }
//     }

//     static Node front = null;
//     static Node rear = null;

//     public static boolean isEmpty() {
//         return front == null && rear == null;
//     }

//     public static void enqueue(int data) {
//         Node newNode = new Node(data);
//         if (front == null) {
//             front = rear = newNode;
//             return;
//         }

//         rear.next = newNode;
//         rear = newNode;
//     }

//     public static int dequeue() {
//         if (isEmpty()) {
//             System.out.println("Queue is empty");
//             return -1;
//         }
//         int front1 = front.data;
//         // single elemant
//         if (rear == front) {
//             rear = front = null;

//         } else {
//             front = front.next;
//         }
//         return front1;
//     }

//     public static int peek() {
//         if (isEmpty()) {
//             System.out.println("empty queue");
//             return -1;
//         }

//         return front.data;
//     }

//     public static void main(String args[]) {
//         queue q = new queue();
//         q.enqueue(1);
//         q.enqueue(2);
//         q.enqueue(3);
//         // 123
//         while (!isEmpty()) {
//             System.out.print(q.peek() + " ");
//             q.dequeue();
//         }
//     }
// }

//circular queue

public class queue {
    static int size;
    static int a[];
    static int rear;
    static int front;

    queue(int n) {
        a = new int[n];
        size = n;
        front = -1;
        rear = -1;
    }

    public static boolean isEmpty() {
        return rear == -1 && front == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;

    }

    public static void enqueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");

            return;
        }

        if (front == -1) {
            front = 0;
        }
        rear = (rear + 1) % size;
        a[rear] = data;
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Empty queue");

            return -1;
        }

        int res = a[front];

        if (rear == front) {
            rear = front = -1;
        } else {
            front = (front + 1) % size;
        }
        return front;

    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("empty queue");
            return -1;
        }
        return a[front];

    }

    public static void main(String[] args) {
        queue q = new queue(5);
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        // 123

        System.out.println(q.remove());

        q.enqueue(4);

        System.out.println(q.remove());
        q.enqueue(5);
        while (!isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
