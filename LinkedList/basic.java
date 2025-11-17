package LinkedList;
import java.util.LinkedList;

// public class basic {
//     public static class Node  {
//     int data;
//     Node next;

//     public Node(int data){
//         this.data = data;
//         this.next = null;
//     }
// }
        
    // public static Node head;
    // public static Node tail;


    // public void addFirst(int data){
    //     Node newNode = new Node(data);



    //     if(head==null){
    //         head = tail= newNode;
    //         return ;

    //     }
    //     newNode.next = head;

    //     head = newNode;
    // }

//     public void addLast(int data){
//         Node newNode = new Node(data);
//         if(head == null){
//             head =tail = newNode;
//             return;

//         }
//         tail.next = newNode;
//         tail = newNode;

//     }

//     public  void print(){
// if(head == null){
//     System.out.println("LinkedList is empty.");
//     return;
// }
//         Node temp = head;
//         while(temp != null){
//             System.out.print(temp.data + "->");
//                 temp = temp.next;

//         }
//         System.out.print("null");
//         System.out.println();
//     }
//     public static void main(String[] args) {
//         basic ll = new basic();
//     ll.addLast(1);
//     ll.addLast(2);
//     ll.addLast(3);
//     ll.addLast(4);
//    ll.print();
  
//     }
// }



public class basic {
    public static  class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;
    public static Node tail;

    public void add(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return; 


        }
        tail.next = newNode;
       tail = newNode;


    }
    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return ;

        }
        Node temp = head;

        while(temp!=null){
System.out.print(temp.data + "->");
temp = temp.next;
        }
        System.out.print("null");
        System.out.println();
    }

     public static void main(String[] args) {
        // Node head = new Node(10);
        // Node head2 = new Node(20);
        // head.next = head2;
        // System.out.println(head.data);
        // System.out.println(head.next.data);

        basic ll = new basic();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);

        ll.print();

     }
}