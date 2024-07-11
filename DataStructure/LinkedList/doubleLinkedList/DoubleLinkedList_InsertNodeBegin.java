package LinkedList.doubleLinkedList;
import java.util.NoSuchElementException;

public class DoubleLinkedList_InsertNodeBegin{
    
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

    private void insertNodeBegin(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            tail = newNode;
        }
        else
        {
            newNode.previous = newNode;
        }
        newNode.next = head;
        head = newNode; 
    }


    public static void main(String[] args)
    {
        
        DoubleLinkedList_InsertNodeBegin dll = new DoubleLinkedList_InsertNodeBegin();
        dll.insertNodeBegin(0);
        dll.insertNodeBegin(1);
        dll.insertNodeBegin(2);
        dll.insertNodeBegin(3);
        dll.printForward();
        dll.printBack();
    }
}