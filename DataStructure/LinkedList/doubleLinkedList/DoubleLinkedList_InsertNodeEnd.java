public class DoubleLinkedList_InsertNodeEnd{
    
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

    public static void main(String[] args)
    {
        
        DoubleLinkedList_InsertNodeEnd dll = new DoubleLinkedList_InsertNodeEnd();
        dll.insertNodeEnd(0);
        dll.insertNodeEnd(1);
        dll.insertNodeEnd(2);
        dll.insertNodeEnd(3);
        dll.printForward();
        dll.printBack();
    }
}