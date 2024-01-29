import java.util.Comparator;
import java.util.PriorityQueue;

public class h1 {

    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// in reverse order print

        pq.add(3);// O(logn)
        pq.add(4);
        pq.add(7);
        pq.add(1);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek());// O(n)
            pq.remove();// O(logn)
        }
    }
}