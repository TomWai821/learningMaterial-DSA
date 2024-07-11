import java.util.NoSuchElementException;

public class Stack {

    private Node top;
    private int length;

    private class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
        }
    }

    public Stack()
    {
        top = null;
        length = 0;
    }

    public int length()
    {
        return length;
    }

    public boolean isEmpty()
    {
        return length == 0;
    }

    public void push(int data)
    {
        Node temp = new Node(data);
        temp.next = top;
        top = temp;
        length++;
    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        int result = top.data;
        top = top.next;
        return result;
    }

    public int peek()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        return top.data;
    }

    public static void main(String[] args)
    {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(10);

        stack.pop();
        System.out.println("Top value(After pop out):"+stack.peek());
    }
}
