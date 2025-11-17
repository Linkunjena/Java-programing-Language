public class linkedlist {

 public class Node {
int data;
Node next;

public  Node(int data){
    this.data = data;
    this.next = null;
}

}
public static Node head;
public static Node tail;
public void addFirst(int data){
        Node newNode = new Node(data);
if(head== null){
    head = tail = newNode;
    return;
}

        newNode.next = head;
     head = newNode;


}

    public void addNum(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail= newNode;
            return ;

        }
        tail.next = newNode;
        tail = newNode;
    }
    public static void print(){
        if(head == null){
            System.out.println("Linkedlist is empty.");
            return;
        }

Node temp = head;
        while(temp != null){
            System.out.print(temp.data+ "->");
            temp = temp.next;

        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.addNum(10);
       
        ll.addNum(30);
        ll.addNum(20);
        ll.addNum(40);
        ll.addNum(50);
         ll.print();
        ll.addFirst(5);
        ll.addFirst(2); 
        ll.print();
       
    }
}
