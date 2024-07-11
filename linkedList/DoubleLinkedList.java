import java.util.NoSuchElementException;

public class DoubleLinkedList{
    
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

    private void insertNodeEnd(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
            head = newNode;
        }
        else
        {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    private Node deleteFirstNode()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        Node temp = head;
        if(head == tail)
        {
            tail = null;
        }
        else
        {
            head.next.previous = null;
        }

        head = head.next;
        temp.next = null;
        return temp;
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
        
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.insertNodeEnd(0);
        dll.insertNodeEnd(1);
        dll.insertNodeEnd(2);
        dll.insertNodeEnd(3);
        dll.deleteLastNode();
        dll.printForward();

        /*
            Node first = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);

            dll.head = first;
            first.next = second;

            second.previous = first;
            second.next = third;

            third.previous = second;
            dll.tail = third;

            dll.printForward();
        */
    }
}