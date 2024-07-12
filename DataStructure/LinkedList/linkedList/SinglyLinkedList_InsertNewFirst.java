
public class SinglyLinkedList_InsertNewFirst{
    
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

    private void insertNewFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    public static void main(String[] args){

        SinglyLinkedList_InsertNewFirst sll = new SinglyLinkedList_InsertNewFirst();
        sll.insertNewFirst(0);
        sll.insertNewFirst(5);
        sll.insertNewFirst(10);
        sll.print();
    }
}

