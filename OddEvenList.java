

public class OddEvenList {
   
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode dummyNode=new ListNode(0);
        ListNode even=dummyNode;
        ListNode odd=head;
        while(odd.next!=null && odd.next.next!=null){
            dummyNode.next=odd.next;
            dummyNode=dummyNode.next;
            odd.next=odd.next.next;
            odd=odd.next;

        }
        if(odd.next!=null){
            dummyNode.next=odd.next;
            dummyNode=dummyNode.next;
            
        }
       
        odd.next=even.next;
        dummyNode.next=null;

        return head;
        
    }
    public static void main(String[] args) {
        OddEvenList oel = new OddEvenList();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5); // Example linked list
        head.next.next.next.next.next = new ListNode(6);

        ListNode result = oel.oddEvenList(head);
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

