
public class SinglyLinkedList_InsertWithPosition{
    
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
    
    private void insertWithPosition(int position, int value){

        ListNode node = new ListNode(value);

        if(position == 1)
        {
            node.next = head;
            head = node;
        }
        else
        {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    public static void main(String[] args){

        SinglyLinkedList_InsertWithPosition sll = new SinglyLinkedList_InsertWithPosition();
        sll.createLinkedList();
        sll.print();
        sll.insertWithPosition(1, 5);
        sll.insertWithPosition(3, 6);
        sll.print();
    }
}

