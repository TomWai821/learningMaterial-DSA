package queue;

import java.util.NoSuchElementException;

public class Queue {
    
    private Node rear;
    private Node front;
    private int length;

    private class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
        }
    }

    public Queue()
    {
        rear = null;
        front = null;
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

    public void enqueue(int data)
    {
        Node temp = new Node(data);

        if(isEmpty())
        {
            front = temp;
        }
        else
        {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public int dequeue()
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }

        int result = front.data;
        front = front.next;

        if(front == null)
        {
            rear = null;
        }

        length--;
        return result;
    }

    public void print()
    {
        int i = 0;
        
        while(i < length)
        {
            System.out.print(front.data + " -> ");
            front = front.next;
            i++;
        }
        System.out.print("null");
    }

    public static void main(String[] args)
    {
        Queue queue = new Queue();
        queue.enqueue(15);
        queue.enqueue(10);
        queue.dequeue();
        queue.print();
    }
}
