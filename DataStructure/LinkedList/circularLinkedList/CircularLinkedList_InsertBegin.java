package LinkedList.circularLinkedList;

public class CircularLinkedList_InsertBegin
{

    private Node last;
    private int length;

    private class Node
    {
        private Node next;
        private int data;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public CircularLinkedList_InsertBegin()
    {
        last = null;
        length = 0;
    }

    private void display()
    {
        if(last == null)
        {
            return;
        }

        Node first = last.next;
        while(first != last)
        {
            System.out.print(first.data + " -> ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    private void insertBegin(int data)
    {
        Node temp = new Node(data);
        
        if(last == null)
        {
            last = temp;
        }
        else
        {
            temp.next = last.next;
        }
        last.next = temp;
        length++;
    }

    public static void main(String[] args)
    {
        CircularLinkedList_InsertBegin cll = new CircularLinkedList_InsertBegin();
        cll.insertBegin(0);
        cll.insertBegin(1);
        cll.insertBegin(2);
        cll.display();
    }
}