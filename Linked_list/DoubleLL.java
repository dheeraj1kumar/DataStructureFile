public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
public Node(int data){
    this.data=data;
    this.next=null;
    this.prev=null;
}

    }
    public static Node head;
    public static Node tail;
    public static int size;

//add
public void addFirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    newNode.next=head;
    head.prev=newNode;
    head=newNode;
}

//print
public void print(){
    Node temp=head;
    while(temp!=null){
        System.out.print(temp.data+"<-->");
        temp=temp.next;
    }
System.out.println("null");
}


//remove
public int removeFirst(){
    if(head==null){
        System.out.println("Dll is empty");
        return Integer.MIN_VALUE;
    }
    if(size==1){
        int val=head.data;
        head=tail=null;
        size--;
        return val;
    }
    int val =head.data;
    head=head.next;
    head.prev=null;
    size--;
    return val;
}

//reverse

public void reverse(){
    Node prev=null;
    Node curr=tail=head;
    Node next;
    while(curr!=null){
        next=curr.next;
        curr.next=prev;
curr.prev=next;

        prev=curr;
        curr=next;
    }
    head=prev;
}


   public static void main(String[] args) {
    DoubleLL dl=new DoubleLL();
    dl.addFirst(3);
    dl.addFirst(2);
    dl.addFirst(1);
  dl.print();
  System.out.println(dl.size);

//   dl.removeFirst();
//   dl.print();
//   System.out.println(dl.size);

dl.reverse();
dl.print();

   } 
}

