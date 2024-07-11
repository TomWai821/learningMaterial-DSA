package LinkedList.circularLinkedList;

public class CircularLinkedList
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

    public CircularLinkedList()
    {
        last = null;
        length = 0;
    }

    private int length()
    {
        return length;
    }

    private boolean isEmpty()
    {
        return length == 0;
    }
    
    private void createCircularLinkedList()
    {
        Node first = new Node(0);
        Node second = new Node(1);
        Node third = new Node(2);
        Node fourth = new Node(3);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;
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


    public static void main(String[] args)
    {
        CircularLinkedList cll = new CircularLinkedList();
        cll.createCircularLinkedList();
        System.out.println("Length:"+cll.length());
        System.out.println("isEmpty:"+cll.isEmpty());
        cll.display();
    }
}