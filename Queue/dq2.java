//stack using deque
// import java.util.*;
// public class dq2 {
//     static class Stack{
//         Deque<Integer> d=new LinkedList<>();

//         //push
//         public void push(int data){
//             d.addLast(data);
//         }

//         //pop
//         public int pop(){
//             return d.removeLast();
//         }

//         //peek

//         public int peek(){
//             return d.getLast();
//         }
//     }

//     public static void main(String[] args) {
//         Stack s=new Stack();
//         s.push(1);
//         s.push(2);
//         s.push(3);

//         System.out.println("peek= "+ s.peek());

//         System.out.println(s.pop());
//         System.out.println(s.pop());
//         System.out.println(s.pop());

//     }

// }

//queue using deque

import java.util.*;
import java.util.LinkedList;

public class dq2 {
    static class Queue {

        Deque<Integer> d = new LinkedList<>();

        // add
        public void add(int data) {
            d.addLast(data);
        }

        // remove
        public int remove() {
            return d.removeFirst();
        }

        // peek

        public int peek() {
            return d.getFirst();
        }
    }

    public static void main(String[] args) {
        Queue s = new Queue();
        s.add(1);
        s.add(2);
        s.add(3);

        System.out.println("peek= " + s.peek());

        System.out.println(s.remove());
        System.out.println(s.remove());
        System.out.println(s.remove());

    }

}