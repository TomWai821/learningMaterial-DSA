public class LinkedList {

    private ListNode head;
    
    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    private void print()
    {
        ListNode current = head;

        while(current != null)
        {
            System.out.print(current.data +" -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    private void insertNewEnd(int value){

        ListNode newNode = new ListNode(value);

        if(head == null){
            head = newNode;
        }

        ListNode current = head;
        if(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    private static ListNode mergeTwoSort(ListNode nodeA, ListNode nodeB){

        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while(nodeA != null && nodeB !=null)
        {
            if(nodeA.data <= nodeB.data)
            {
                tail.next = nodeA;
                nodeA = nodeA.next;
            }
            else
            {
                tail.next = nodeB;
                nodeB = nodeB.next; 
            }
            tail = tail.next;
        }
        if(nodeA == null)
        {
            tail.next = nodeB;
        }
        else
        {
            tail.next = nodeA;
        }
        return dummy.next;
    }

    private static ListNode addTwoNode(ListNode nodeA, ListNode nodeB)
    {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while(nodeA != null || nodeB !=null)
        {
            int a = (nodeA != null) ? nodeA.data : 0;
            int b = (nodeB != null) ? nodeB.data : 0;
            int sum = carry + a + b;

            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;

            if(nodeA != null) {nodeA = nodeA.next;}
            if(nodeB != null) {nodeB = nodeB.next;}
        }

        if(carry > 0)
        {
            tail.next = new ListNode(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args)
    {
        LinkedList linkedList = new LinkedList();
        linkedList.insertNewEnd(3);
        linkedList.insertNewEnd(4);
        linkedList.insertNewEnd(3);
        linkedList.print();

        LinkedList linkedList2 = new LinkedList();
        linkedList2.insertNewEnd(5);
        linkedList2.insertNewEnd(6);
        linkedList2.insertNewEnd(4);
        linkedList2.print();

        LinkedList result = new LinkedList();
        result.head = addTwoNode(linkedList.head, linkedList2.head);
        result.print();
        //result.head = mergeTwoSort(linkedList.head, linkedList2.head);

    }
}
