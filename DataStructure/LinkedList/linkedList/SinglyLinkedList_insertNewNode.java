
public class SinglyLinkedList_insertNewNode{
    
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

    private ListNode insertNewNode(int value){
        sortNode();
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        
        while(current != null && current.data < newNode.data)
        {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    public static void main(String[] args)
    {
        SinglyLinkedList_insertNewNode sll = new SinglyLinkedList_insertNewNode();
        sll.createLinkedList();
        sll.print();
        sll.insertNewNode(8);
        sll.print();
    }
}

