
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        if( lists==null || lists.length==0)
        {
            return null;
        }

        PriorityQueue<ListNode>pq= new PriorityQueue<>((a,b)-> a.val-b.val);

        for( ListNode head : lists)
        {
            if( head!=null)
            {
                pq.add( head);
            }
        }

        ListNode ansHead = new ListNode(-1);
        ListNode tail= ansHead;

        while(pq.size()>0)
        {
            ListNode curr= pq.poll(); // remove the top element of the pq

            tail.next=curr;
            tail= tail.next;

            curr= curr.next;

            if(curr!=null)
            {
                pq.add( curr);
            }
        }

        return ansHead.next;
    }
}