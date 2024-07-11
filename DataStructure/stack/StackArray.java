public class StackArray {
    private int top;
    private int[] arr;

    public StackArray(int data)
    {
        top = -1;
        arr = new int[data];
    }

    public StackArray(){
        this(10);
    }

    public boolean isFull()
    {
        return arr.length == size();
    }

    public boolean isEmpty()
    {
        return top < 0;
    }

    public int size()
    {
        return top + 1;
    }

    public void push(int data)
    {
        if(isFull())
        {
            throw new RuntimeException("Stack is full!");
        }
        top++;
        arr[top] = data;
    }

    public int pop()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack is empty!!");
        }
        top--;
        return arr[top];
    }

    public int peek()
    {
        if(isEmpty())
        {
            throw new RuntimeException("Stack is empty!!");
        }
        System.out.print(arr[top]);
        return arr[top];
    }

    public static void main(String[] args)
    {
        StackArray stackArray = new StackArray();
        stackArray.push(0);
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);
        stackArray.pop();
        stackArray.peek();
    }
}
