//circular queue

public class q2 {
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        public static boolean isEmpty() {
            return rear == -1 && front == -1;

        }

        // full
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data) {
            if (isFull()) {

                System.out.println("Queue is full");

                return;
            }
            // add 1st element
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;

            }
            int result = arr[front];
            // last el delete
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return front;

        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("empty queue");
                return -1;

            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.add(1);
        q.add(2);
        q.add(3);
        // 1 2 3
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }
}

// circular queue using without formula
/*
 * public class CircularQueue {
 * 
 * private int[] queue;
 * private int rear;
 * private int front;
 * private int size;
 * 
 * public CircularQueue (int n) {
 * size = n;
 * queue = new int[size];
 * rear = front = -1;
 * }
 * 
 * private int delete() {
 * int elem = -1;
 * if (front == -1 || rear ==-1) {
 * System.out.println("Queue is Empty :(");
 * } else if (rear == front) {
 * elem = queue[front];
 * rear = front = -1;
 * } else if (front == size - 1) {
 * elem = queue[front];
 * front = 0;
 * } else {
 * elem = queue[front];
 * front++;
 * }
 * 
 * return elem;
 * 
 * }
 * 
 * private void insert(int i) {
 * if (front == rear + 1 || size == rear + 1) {
 * System.out.println("Queue is Full :(");
 * 
 * } else if (front == -1 && rear == -1) {
 * front = rear = 0;
 * queue[rear] = i;
 * } else if (rear == size - 1) {
 * rear = 0;
 * queue[rear] = i;
 * 
 * } else {
 * rear++;
 * queue[rear] = i;
 * }
 * 
 * }
 * 
 * private void print() {
 * if (front == -1) {
 * System.out.println("Queue is Empty!");
 * return;
 * }
 * 
 * if (rear >= front) {
 * for (int i = front; i <= rear; i++) {
 * System.out.print(queue[i] + " ");
 * }
 * } else {
 * 
 * for (int i = front; i < size; i++) {
 * System.out.print(queue[i] + " ");
 * }
 * 
 * for (int i = 0; i <= rear; i++) {
 * System.out.print(queue[i] + " ");
 * }
 * }
 * 
 * System.out.println();
 * }
 * 
 * // Driver Code
 * public static void main(String[] args) {
 * CircularQueue cqueue = new CircularQueue(5);
 * cqueue.print();
 * cqueue.insert(0);
 * cqueue.print();
 * cqueue.insert(10);
 * cqueue.print();
 * cqueue.insert(20);
 * cqueue.print();
 * cqueue.insert(30);
 * cqueue.print();
 * cqueue.delete();
 * cqueue.print();
 * cqueue.insert(40);
 * cqueue.print();
 * 
 * // Output:
 * // Queue is Empty!
 * // 0
 * // 0 10
 * // 0 10 20
 * // 0 10 20 30
 * // 10 20 30
 * // 10 20 30 40
 * 
 * }
 * 
 * }
 */