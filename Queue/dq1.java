import java.util.LinkedList;

//deque
import java.util.*;
public class dq1 {
    public static void main(String[] args) {
        Deque<Integer> d=new LinkedList<>();
        d.addFirst(1);//1
        d.addFirst(2);// 2 1
d.addLast(3);//213
d.addLast(4);//2134

        System.out.println(d);
        // d.removeFirst();
        // System.out.println(d);

        d.removeLast();
        System.out.println(d);
        System.out.println(d.getFirst()  +" and "+d.getLast());
        
    }
    
}
