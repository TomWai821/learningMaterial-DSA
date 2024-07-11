package LinkedList.circularLinkedList;

public class CircularLinkedList_InsertLast
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

    public CircularLinkedList_InsertLast()
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

    private void insertLast(int data)
    {
        Node temp = new Node(data);

        if(last == null)
        {
            last = temp;
            last.next = last;
        }
        else
        {
            temp.next = last.next;
            last.next = temp;
            last = temp;
        }
        length++;
    }

    public static void main(String[] args)
    {
        CircularLinkedList_InsertLast cll = new CircularLinkedList_InsertLast();
        cll.insertLast(0);
        cll.insertLast(1);
        cll.insertLast(2);
        cll.display();
    }
}