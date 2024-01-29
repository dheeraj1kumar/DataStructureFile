

public class FloydsCircleFindAlgorithm{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;     // +1 step
            fast=fast.next.next;    // +2 step
            if(slow==fast){
                return true;    //cycle exist
            }
        }
        return false;           // if cycle does not exist
    }

    public static void main(String[] args) {
        // FloydsCircleFindAlgorithm ll=new FloydsCircleFindAlgorithm();
        head=new Node(1);   //  1
        head.next=new Node(2);  //1->2                      :- false
        head.next.next=new Node(3); // 1->2->3             :- false
        head.next.next.next=head;       //  1->2->3->1          :-true
        // head.next.next.next=head.next;   // 1->2->3->1->2    :- true b/c head and tail both match
        head.next.next.next.next=new Node(9);           // 1->2->3->1->2->9 :- false b/c head and tail does not match
  
        System.out.println(isCycle());
      
    }
}













