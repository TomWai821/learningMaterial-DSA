public class LinkedList_mergeTwoSort {

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

    public static void main(String[] args)
    {
        LinkedList_mergeTwoSort linkedList = new LinkedList_mergeTwoSort();
        linkedList.insertNewEnd(3);
        linkedList.insertNewEnd(4);
        linkedList.insertNewEnd(3);
        linkedList.print();

        LinkedList_mergeTwoSort linkedList2 = new LinkedList_mergeTwoSort();
        linkedList2.insertNewEnd(5);
        linkedList2.insertNewEnd(6);
        linkedList2.insertNewEnd(4);
        linkedList2.print();

        LinkedList_mergeTwoSort result = new LinkedList_mergeTwoSort();
        result.head = mergeTwoSort(linkedList.head, linkedList2.head);
        result.print();


    }
}
