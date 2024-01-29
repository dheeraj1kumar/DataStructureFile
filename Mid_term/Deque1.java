package Mid_term;

import java.util.Scanner;

class Deque1 {

    static final int MAX = 100;

    int arr[];

    int front;

    int rear;

    int size;

    public Deque1(int size) {

        arr = new int[MAX];
        front = -1;
        rear = 0;
        this.size = size;
    }

    boolean isFull() {
        return ((front == 0 && rear == size - 1) || front == rear + 1);
    }

    boolean isEmpty() {
        return (front == -1);
    }

    // new method
    void insertfront(int item) {

        if (isFull()) {
            System.out.println("Overflow");
            return;
        }

        if (front == -1) {
            front = 0;
            rear = 0;
        }

        // front is at first position of queue
        else if (front == 0)
            front = size - 1;

        else // decrement front end by '1'
            front = front - 1;

        // insert current element into Deque
        arr[front] = item;
    }

    void insertrear(int item) {
        if (isFull()) {
            System.out.println(" Overflow ");
            return;
        }

        // If queue is initially empty
        if (front == -1) {
            front = 0;
            rear = 0;
        }

        // rear is at last position of queue
        else if (rear == size - 1)
            rear = 0;

        // increment rear end by '1'
        else
            rear = rear + 1;

        // insert current element into Deque
        arr[rear] = item;
    }

    void deletefront() {
        // check whether Deque is empty or not
        if (isEmpty()) {
            System.out.println("Queue Underflow\n");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else
        // back to initial position
        if (front == size - 1)
            front = 0;

        else
            front = front + 1;
    }

    // new method
    void deleterear() {
        if (isEmpty()) {
            System.out.println(" Underflow");
            return;
        }

        // Deque has only one element
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0)
            rear = size - 1;
        else
            rear = rear - 1;
    }

    int getFront() {

        if (isEmpty()) {
            System.out.println(" Underflow");
            return -1;
        }
        return arr[front];
    }

    int getRear() {
        // check whether Deque is empty or not
        if (isEmpty() || rear < 0) {
            System.out.println(" Underflow\n");
            return -1;
        }
        return arr[rear];
    }

    void printDeque() {
        for (int i = front; i <= rear; i++) {
            if (i != 0)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Deque1 dq = new Deque1(5);
        Scanner sc = new Scanner(System.in);

        int data;
        int count = 0;
        char ch;

        do

        {
            // Menu

            System.out.println("Please Choose one of the Operations::");
            System.out.println("1. To Insert Data at the Front of Deque.");
            System.out.println("2. To Insert Data at the Rear of Deque.");
            System.out.println("3. To Print Data from the Front of Deque.");
            System.out.println("4. To Print Data from the Rear of Deque.");
            System.out.println("5. To Delete Data from the Front of Deque.");
            System.out.println("6. To Delete Data from the Rear of Deque.");
            System.out.println("7. To print the Deque.");

            int choice;
            choice = sc.nextInt();

            // Switch case
            switch (choice) {

                // Case 1
                case 1:

                    System.out.println("Enter the data :\n");
                    data = sc.nextInt();
                    dq.insertfront(data);

                    System.out.println("Data Added Successfully.\n");

                    break;

                // Case 2
                case 2:

                    System.out.println("Enter the data :\n");
                    data = sc.nextInt();
                    dq.insertrear(data);

                    System.out.println("Data Added Successfully.\n");

                    break;

                // Case 3
                case 3:

                    System.out.println("Data at front:" + dq.getFront() + "\n");
                    break;

                // Case 4
                case 4:

                    System.out.println("Data at rear:" + dq.getRear() + "\n");
                    break;

                // Case 5
                case 5:

                    dq.deletefront();
                    System.out.println("Data deleted from the front.");
                    break;

                // Case 6
                case 6:

                    dq.deleterear();
                    System.out.println("Data deleted from the rear.");
                    break;

                // Case 7
                case 7:

                    System.out.println("Data in Deque::");
                    dq.printDeque();
                    break;

                default:

                    System.out.println("Please enter a valid option from the menu to proceed further.\n \n");

                    break;
            }

            System.out.println("\nType [N or n] to terminate the program.\nType [Y or y] to continue the program.\n");
            sc.nextLine();
            ch = sc.nextLine().charAt(0);

        } while (!(ch == 'N' || ch == 'n'));

    }
}
