
public class SinglyLinkedList_searchValue{
    
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
    
    private boolean searchValue(int searchKey)
    {
        ListNode current = head;

        while(current != null){
            if(current.data == searchKey)
            {
                System.out.println("Found value in Linked List");
                return true;
            }
            current = current.next;
        }
        System.out.println("Cannot found the value");
        return false;
    }

    public static void main(String[] args){

        SinglyLinkedList_searchValue sll = new SinglyLinkedList_searchValue();
        sll.createLinkedList();
        sll.print();

        sll.searchValue(0);
        sll.print();
    }
}

