public class pallindrome {
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


     public void print(){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-> ");
            temp = temp.next;
        }
        System.out.println("null");

    }

    private Node findMidNode(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }


    public boolean checkPalindrome(){
        if(head == null || head.next == null){
            return true;
        }

        //find mid
        Node mid = findMidNode(head);

        //reverse 2nd half

        Node curr = mid;
        Node prev = null;
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;
        Node left  = head;

        // check if equal
        while(right != null){
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
    public static void main(String[] args) {
        pallindrome ll = new pallindrome();
            ll.add(1);
            ll.add(2);
            ll.add(3);
            ll.add(1);
            
            ll.print();
            System.out.println(ll.checkPalindrome());
    }

}
