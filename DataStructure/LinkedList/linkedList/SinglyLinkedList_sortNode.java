
public class SinglyLinkedList_sortNode{
    
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
    
    private void sortNode(){
        ListNode current = head;
        ListNode secondNode = null;
        int temp;

        if(head == null)
        {
            return;
        }
        else
        {
            while(current != null)
            {
                secondNode = current;
        
                while (secondNode != null) 
                {
                    if (current.data > secondNode.data) 
                    {
                        temp = current.data;
                        current.data = secondNode.data;
                        secondNode.data = temp;
                    }

                    secondNode = secondNode.next;
                }
                current = current.next;
            }
        }
    }


    public static void main(String[] args){

        SinglyLinkedList_sortNode sll = new SinglyLinkedList_sortNode();
        sll.createLinkedList();
        sll.print();
        sll.sortNode();
        sll.print();
    }
}

