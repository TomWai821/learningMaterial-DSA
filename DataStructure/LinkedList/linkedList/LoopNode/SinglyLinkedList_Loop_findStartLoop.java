
public class SinglyLinkedList_Loop_findStartLoop{
    
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

    private void createLoopNode(){

        ListNode first = new ListNode(0);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        ListNode fifth = new ListNode(20);
        ListNode sixth = new ListNode(25);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }


    private ListNode findStartLoop(ListNode node){
        ListNode temp = head;
        while(node != temp){
            temp = temp.next;
            node = node.next;
        }
        System.out.println(temp.data);
        return temp;
    }

    public static void main(String[] args){

        SinglyLinkedList_Loop_findStartLoop sll = new SinglyLinkedList_Loop_findStartLoop();
        sll.createLoopNode();
        sll.findStartLoop(sll.head);
        sll.print();
    }
}

