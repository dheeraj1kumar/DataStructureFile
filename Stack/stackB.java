// by arraylist

// import java.util.ArrayList;

// public class stackB{
// static class Stack{

// static ArrayList<Integer>list=new ArrayList<>();
// public static boolean isEmpty(){
// return list.size()==0;
// }

// //push
// public static void push(int data){
// list.add(data);
// }
// //pop
// public static int pop(){
// if(isEmpty()){
// return -1;
// }
// int top=list.get(list.size()-1);
// list.remove(list.size()-1);
// return top;
// }
// //peek
// public static int peek(){
// if(isEmpty()){
// return -1;
// }
// return list.get(list.size()-1);
// }

// }

// public static void main(String[] args) {
// Stack s=new Stack();
// s.push(1);
// s.push(2);
// s.push(3);

// while(!s.isEmpty()){
// System.out.println(s.peek());
// s.pop();
// }

// }
// }

// by linkedlist

// import java.util.LinkedList;

// public class stackB{
// static class Node{
// int data;
// Node next;
// Node(int data){
// this.data=data;
// this.next=null;
// }
// }
// static class Stack{
// static Node head=null;
// public static boolean isEmpty(){
// return head==null;
// }

// //push
// public static void push(int data){
// Node newNode=new Node(data);

// if(isEmpty()){
// head=newNode;
// return;

// }
// newNode.next=head;
// head=newNode;
// }

// //pop
// public static int pop(){
// if(isEmpty()){
// return -1;
// }
// int top=head.data;
// head=head.next;
// return top;
// }

// //peek
// public static int peek(){
// if(isEmpty()){
// return -1;
// }
// return head.data;
// }

// }

// public static void main(String[] args) {
// Stack s=new Stack();
// s.push(1);
// s.push(2);
// s.push(3);

// while(!s.isEmpty()){
// System.out.println(s.peek());
// s.pop();
// }

// }
// }

// by collection frameWork
// import java.util.*;

// public class stackB{

// public static void main(String[] args) {
// Stack<Integer> s=new Stack<>();
// // Stack s=new Stack();
// s.push(1);
// s.push(2);
// s.push(3);

// while(!s.isEmpty()){
// System.out.println(s.peek());
// s.pop();
// }

// }
// }

//by Array
import java.util.*;

class stack {
    static int s[];
    static int top;
    static int max;

    stack(int size) {
        s = new int[size];
        max = size;
        top = -1;

    }

    public void push(int data) {
        if (top == max - 1) {
            System.out.println("Stack is overflow");
        } else {
            System.out.println("Push eelment" + data);
            s[++top] = data;

        }
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack is underflow");

        } else {
            System.out.println("pop element");

        }
        return s[top--];
    }

    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        return s[top];

    }

    // some extra method:
    public int getsize() {
        return top + 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max - 1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("stack is empty");

        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(s[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        stack st = new stack(10);
        st.push(1);
        st.push(2);
        st.push(3);
        st.display();

        st.pop();

        st.display();

        System.out.println("peek element " + st.peek());
    }
}
