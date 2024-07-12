
public class SinglyLinkedList_deleteNodeWithPosition{
    
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
    
    private void deleteNodeWithPosition(int position)
    {
        if(position == 1)
        {
            head = head.next;
        }
        else
        {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }  
    }

    public static void main(String[] args){

        SinglyLinkedList_deleteNodeWithPosition sll = new SinglyLinkedList_deleteNodeWithPosition();
        sll.createLinkedList();
        sll.print();
        sll.deleteNodeWithPosition(1);
        sll.deleteNodeWithPosition(3);
        sll.print();
    }
}

