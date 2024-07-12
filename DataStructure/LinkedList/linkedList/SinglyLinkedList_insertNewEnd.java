
public class SinglyLinkedList_insertNewEnd{
    
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
    
    public static void main(String[] args){

        SinglyLinkedList_insertNewEnd sll = new SinglyLinkedList_insertNewEnd();
        sll.createLinkedList();
        sll.print();
        
        sll.insertNewEnd(0);
        sll.insertNewEnd(10);
        sll.insertNewEnd(20);
        sll.print();
    }
}

