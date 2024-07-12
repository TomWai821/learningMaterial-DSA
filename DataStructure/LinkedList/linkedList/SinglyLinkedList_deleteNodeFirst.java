
public class SinglyLinkedList_deleteNodeFirst{
    
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
    
    private ListNode deleteNodeFirst(){
        if(head == null){
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    public static void main(String[] args){

        SinglyLinkedList_deleteNodeFirst sll = new SinglyLinkedList_deleteNodeFirst();
        sll.createLinkedList();
        sll.print();
        sll.deleteNodeFirst();
        sll.print();
    }
}

