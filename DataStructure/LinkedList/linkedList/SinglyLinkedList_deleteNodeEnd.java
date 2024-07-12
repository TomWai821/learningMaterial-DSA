
public class SinglyLinkedList_deleteNodeEnd{
    
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

    private ListNode deleteNodeEnd(){
        if(head == null || head.next == null)
        {
            return null;
        }

        ListNode current = head;
        ListNode previous = null;

        while(current.next != null)
        {
            previous = current;
            current = current.next;
        }
        
        previous.next = null;
        return current;
    }

    public static void main(String[] args){

        SinglyLinkedList_deleteNodeEnd sll = new SinglyLinkedList_deleteNodeEnd();
        sll.createLinkedList();
        sll.print();
        sll.deleteNodeEnd();
        sll.print();

    }
}

