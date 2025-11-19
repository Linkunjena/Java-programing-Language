import java.util.*;

public class searchRecursive {


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

    public static void add(int data){
        Node newNode = new Node(data);

        if(head == null){
          head = tail = newNode;
          return;
        }
        tail.next = newNode;
           tail = newNode;
    }


     public static void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
     }



     public int reSearch(int key){
        return helper(head, key);
     }


     public int helper(Node head, int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;

        }

        int idx = helper(head.next, key);

        if(idx == -1){
            return -1;
        }

        return idx+1;
     }
    public static void main(String[] args) {
        searchRecursive ll = new searchRecursive();
ll.add(1);
ll.add(2);
ll.add(3);
ll.add(4);
ll.add(5);
ll.print();
System.out.println(ll.reSearch(4));
System.out.println(ll.reSearch(10));
    }
}
