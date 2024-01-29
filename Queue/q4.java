import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

//by collection framework

public class q4 {
    public static void main(String[] args) {
       // Queue<Integer> q=new LinkedList<>();//ArrayDeque
       Queue<Integer> q=new ArrayDeque<>();//ArrayDeque
    
        q.add(1);
        q.add(2);
        q.add(3);
        //1 2 3



        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        
    }
}

    

