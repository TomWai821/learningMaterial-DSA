
public class SinglyLinkedList_reverseNode{
    
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    private void print(){
        ListNode current = head;

        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    private int countLength(){
        ListNode current = head;
        int count = 0;
        
        //count linkedlist length
        while(current != null){
            count++;
            current = current.next;
        }
        System.out.println("Length = " + count);
        return count;
    }

    private void createLinkedList()
    {
        ListNode head = new ListNode(10);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(8);

        head.next = second;
        second.next = third;
        third.next = fourth;
    }
    
    private ListNode reverseNode(ListNode head)
    {
        if(head == null){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String[] args){

        SinglyLinkedList_reverseNode sll = new SinglyLinkedList_reverseNode();
        sll.createLinkedList();
        sll.print();
        sll.reverseNode(sll.head);
        sll.print();

    }
}

