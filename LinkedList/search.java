public class search {
   public static class Node{
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
        head  = tail = newNode;
        return;
    }

    tail.next  = newNode;
    tail = newNode;
   }


   public int itrSearch(int key){
    Node temp = head;
    int i = 0;

    while (temp != null) {
        if(temp.data == key){
            return i;
        }
        temp = temp.next;
        i++;
    }
    return -1;
   }

   public void print(){
    if(head == null){
        System.out.println("LinkedList is Empty");
        return;
    }

    Node temp = head;
    while (temp != null) {
        System.out.print(temp.data+ "-> ");
        temp = temp.next;
    }
    System.out.println("null");

   }
   
    public static void main(String[] args) {
        search ll = new search();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
       ll.print();
        
        System.out.println(ll.itrSearch(4));

       
    }
}
