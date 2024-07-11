
import java.util.NoSuchElementException;

public class DoubleLinkedList_deleteLastNode{
    
    private Node head;
    private Node tail;
    private int length = 0;
    
    private static class Node
    {
        private Node previous;
        private int data;
        private Node next;

        public Node(int data){
            this.previous = null;
            this.data = data;
            this.next = null;
        }
    }

    private void createDoubleLinkedList()
    {
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head = first;
        first.next = second;

        second.previous = first;
        second.next = third;

        third.previous = second;
        tail = third;
    }


    private void printForward()
    {
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private void printBack()
    {
        Node temp = tail;

        while(temp != null)
        {
            System.out.print(temp.data + " -> ");
            temp = temp.previous;
        }
        System.out.println("null");
    }

    private boolean isEmpty()
    {
        return length == 0;
    }

    private void countLength()
    {
        Node current = head;
        while(current != null)
        {
            length++;
            current = current.next;
        }
        System.out.println("Length: "+ length);
    }

    private Node deleteLastNode()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        Node temp = tail;
        if(head == tail)
        {
            head = null;
        }
        else
        {
            tail.previous.next = null;
        }

        tail = tail.previous;
        temp.previous = null;
        return temp;
    }

    public static void main(String[] args)
    {
        
        DoubleLinkedList_deleteLastNode dll = new DoubleLinkedList_deleteLastNode();
        dll.createDoubleLinkedList();
        dll.deleteLastNode();
        dll.printForward();
        dll.printBack();
    }
}