public class removeNthNode {
    public static class Node {
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
        tail  = newNode;
    }


    public void deleteNthformEnd(int n){
        int sz = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz ){
            head = head.next;
            return;
        }

        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind){
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");

    }
    public static void main(String[] args) {
            removeNthNode ll = new removeNthNode();
            ll.add(1);
            ll.add(2);
            ll.add(3);
            ll.add(4);
            ll.add(5);
            ll.print();
            ll.deleteNthformEnd(3);
            ll.print();
    }
}
