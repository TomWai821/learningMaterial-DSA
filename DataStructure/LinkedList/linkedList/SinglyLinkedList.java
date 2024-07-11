
public class SinglyLinkedList{
    
    private ListNode head;

    private static class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    // Print the node value with while loop
    /*
    private void print(ListNode current){
        //display linkedlist data
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
    */

    private void print(){
        ListNode current = head;
        //display linkedlist data
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }


    // Count linkedList length with while loop
    private int countLength(){
        ListNode current = head;
        int count = 0;
        
        //count linkedlist length
        while(current != null){
            count++;
            current = current.next;
        }
        System.out.println("Length = " + count);
        return count;
    }

    // Insert new node front of current node 
    private void insertNewFirst(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }

    // Insert Node end of current node 
    private void insertNewEnd(int value){

        ListNode newNode = new ListNode(value);

        if(head == null){
            head = newNode;
        }

        ListNode current = head;
        if(current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }
    

    // Insert Node with position
    private void insertWithPosition(int position, int value){

        ListNode node = new ListNode(value);

        if(position == 1)
        {
            node.next = head;
            head = node;
        }
        else
        {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            node.next = current;
            previous.next = node;
        }
    }

    private ListNode deleteNodeFirst(){
        if(head == null){
            return null;
        }

        ListNode temp = head;
        head = head.next;
        temp.next = null;
        return temp;
    }

    private ListNode deleteNodeEnd(){
        if(head == null || head.next == null)
        {
            return null;
        }

        ListNode current = head;
        ListNode previous = null;

        while(current.next != null)
        {
            previous = current;
            current = current.next;
        }
        
        previous.next = null;
        return current;
    }

    private void deleteNodeWithPosition(int position)
    {
        if(position == 1)
        {
            head = head.next;
        }
        else
        {
            ListNode previous = head;
            int count = 1;
            while(count < position - 1)
            {
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }  
    }

    private boolean searchValue(int searchKey)
    {
        ListNode current = head;

        while(current != null){
            if(current.data == searchKey)
            {
                System.out.println("Found value in Linked List");
                return true;
            }
            current = current.next;
        }
        System.out.println("Cannot found the value");
        return false;
    }

    private ListNode reverseNode(ListNode head)
    {
        if(head == null){
            return head;
        }

        ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    private ListNode findTargetNode(int n){

        ListNode endNode = head;
        ListNode targetNode = head;
        int count = 0;

        while(count < n)
        {
            endNode = endNode.next;
            count++;
        }

        while(endNode != null)
        {
            endNode = endNode.next;
            targetNode = targetNode.next;
        }
        System.out.println("Find the value from the end!");
        System.out.println("Value: " + targetNode.data);
        return targetNode;
    }

    private void sortNode(){
        ListNode current = head;
        ListNode secondNode = null;
        int temp;

        if(head == null)
        {
            return;
        }
        else
        {
            while(current != null)
            {
                secondNode = current;
        
                while (secondNode != null) 
                {
                    if (current.data > secondNode.data) 
                    {
                        temp = current.data;
                        current.data = secondNode.data;
                        secondNode.data = temp;
                    }

                    secondNode = secondNode.next;
                }
                current = current.next;
            }
        }
    }

    private void findDupNode(){
        
        sortNode();

        ListNode current = head;
        while(current != null && current.next != null)
        {
            if(current.data == current.next.data)
            {
                current.next = current.next.next;
            }
            else
            {
                current = current.next;
            }
        }
    }

    private ListNode insertNewNode(int value){
        sortNode();
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode temp = null;
        
        while(current != null && current.data < newNode.data)
        {
            temp = current;
            current = current.next;
        }
        newNode.next = current;
        temp.next = newNode;
        return head;
    }

    private void removeNode(int valueKey)
    {
        sortNode();
        ListNode current = head;
        ListNode temp = null;

        while(current != null && current.data != valueKey)
        {
            temp = current;
            current = current.next;
        }

        if(current == null)
        {
            return;
        }
       
        temp.next = current.next;
    }

    private void createLoopNode(){

        ListNode first = new ListNode(0);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);
        ListNode fifth = new ListNode(20);
        ListNode sixth = new ListNode(25);

        head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = third;
    }

    private boolean checkLoopNode(){
        ListNode firstNode = head;
        ListNode secondNode = head;
        while(firstNode != null && secondNode !=null)
        {
            firstNode = firstNode.next.next;
            secondNode = secondNode.next;

            if(firstNode == secondNode)
            {
                System.out.println("Here have loop in Linked List");
                return true;
            }
        }
        System.out.println("Here don't have loop in Linked List");
        return false;
    }

    private ListNode findLoopNode(){
        ListNode firstNode = head;
        ListNode secondNode = head;
        while(firstNode != null && secondNode !=null)
        {
            firstNode = firstNode.next.next;
            secondNode = secondNode.next;

            if(firstNode == secondNode)
            {
                //return findStartLoop(secondNode);
                removeLoop(secondNode);
            }
        }
        return null;
    }

    private ListNode findStartLoop(ListNode node){
        ListNode temp = head;
        while(node != temp){
            temp = temp.next;
            node = node.next;
        }
        System.out.println(temp.data);
        return temp;
    }

    private void findLoop(){
        ListNode firstNode = head;
        ListNode secondNode = head;
        while(firstNode != null && secondNode !=null)
        {
            firstNode = firstNode.next.next;
            secondNode = secondNode.next;

            if(firstNode == secondNode)
            {
                //return findStartLoop(secondNode);
                removeLoop(secondNode);
                return;
            }
        }
    }

    private void removeLoop(ListNode node){
        ListNode temp = head;
        while(node != temp){
            temp = temp.next;
            node = node.next;
        }
        node.next = null;
    }

    public static void main(String[] args){

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createLoopNode();
        sll.findLoop();
        //sll.checkLoopNode();
        sll.print();
    /*

        ListNode head = new ListNode(10);
        ListNode second = new ListNode(0);
        ListNode third = new ListNode(5);
        ListNode fourth = new ListNode(8);

        head.next = second;
        second.next = third;
        third.next = fourth;

        sll.deleteNodeWithPosition(1);
        sll.deleteNodeWithPosition(3);
        
        sll.insertWithPosition(1, 5);
        sll.insertWithPosition(3, 6);

        sll.insertNewEnd(0);
        sll.insertNewEnd(10);
        sll.insertNewEnd(20);

        sll.insertNewFirst(0);
        sll.insertNewFirst(5);
        sll.insertNewFirst(10);

        sll.head.next = second;
        second.next = third;

        sll.countLength();
        sll.findTargetNode(1);
        */

    }
}

