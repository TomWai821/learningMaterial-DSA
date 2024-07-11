package binaryTree;

import java.util.*;

public class BinaryTree 
{

    private TreeNode root;

    private class TreeNode
    {

        private TreeNode left;
        private int data;
        private TreeNode right;

        public TreeNode(int data)
        {
            this.data = data;
        }
    }

    public void createBinaryTree()
    {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);

        root = first;
        first.left = second; // second <- first 
        first.right = third; // second <- first -> third

        second.left = fourth; // fourth <- third
        second.right = fifth; // fourth <- third -> fifth

        third.left = sixth;
        third.right = seventh;
    }

    public void preOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        System.out.println("" + root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    public void preOrderWithStack(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty())
        {
            TreeNode temp = stack.pop();
            System.out.println(temp.data + "");

            if(temp.right != null)
            {
                stack.push(temp.right);
            }
            
            if(temp.left != null)
            {
                stack.push(temp.left);
            }
        }
    }

    public void InOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        InOrder(root.left);
        System.out.println("" + root.data);
        InOrder(root.right);
    }

    public void InOrderWithStack(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode temp = root;

        while(!stack.isEmpty() || temp != null)
        {
            if(temp != null)
            {
                stack.push(temp);
                temp = temp.left;
            }
            else
            {
                temp = stack.pop();
                System.out.println(temp.data + " ");
                temp = temp.right;
            }
        }
    }

    public void PostOrder(TreeNode root)
    {   
        // return to main class while root TreeNode is null
        if(root == null)
        {
            return;
        }

        // Keep using postOrder method with root.left TreeNode value (until root.left is null)
        PostOrder(root.left);

        // Keep using postOrder method with root.right TreeNode value (until root.right is null)
        PostOrder(root.right);

        // Print the root data (while root.left and root.right are null)
        System.out.println(root.data);
    }

    public void PostOrderWithStack(TreeNode root)
    {
        // Create a stack to store current TreeNode value
        Stack<TreeNode> stack = new Stack<TreeNode>();

        // Create a TreeNode called current and set it as root TreeNode value/position
        TreeNode current = root;

        while(!stack.isEmpty() || current != null)
        {
            // 1. Push current TreeNode to stack 
            // 2. Change current TreeNode to current.left TreeNode (while current node is not null OR stack is not empty)
            if(current != null)
            {
                stack.push(current);
                current = current.left;
            }
            else
            {
                // 1. Create a TreeNode called temp
                // 2. Set temp as stack.peek().right TreeNode (while current is null)
                // Remarks: stack.peek() = current TreeNode 
                TreeNode temp = stack.peek().right;

                // 1. Set temp as stack.pop() node
                // 2. Print the pop out value (while current temp TreeNode is null)
                if(temp == null)
                {
                    temp = stack.pop();
                    System.out.println(temp.data + "");
                    
                    // 1. Set temp as stack.pop() node
                    // 2. Print the pop out value (while stack is not empty AND temp node = stack.peek().right node)
                    while(!stack.isEmpty() && temp == stack.peek().right)
                    {
                        temp = stack.pop();
                        System.out.println(temp.data + "");
                    }
                }
                else
                {
                    // Set current node as temp node(while current is null)
                    // Remarks: (current = null) means there are nothing in current.right side
                    current = temp;
                }
            }
        }
    }

    public void LevelOrder(TreeNode root)
    {
        // return to main class while root value is null
        if(root == null)
        {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        // Add root TreeNode to queue before view other TreeNode
        queue.add(root);

        while(!queue.isEmpty())
        {
            // Create a TreeNode called temp and set it as poll out value from queue while queue is not empty
            TreeNode temp = queue.poll();
            System.out.println(temp.data);

            // Add temp.left value while temp.left node is not null
            if(temp.left != null)
            {
                queue.add(temp.left);
            }

            // Add temp.right value while temp.right node is not null
            if(temp.right != null)
            {
                queue.add(temp.right);
            }
        }
    }

    public int findMaximum(TreeNode root)
    {
        if(root == null)
        {
            return Integer.MIN_VALUE;
        }

        int result = root.data;

        int left = findMaximum(root.left);
        int right = findMaximum(root.right);
        
        if(left > result)
        {
            result = left;
        }
        
        if(right > result)
        {
            result = right;
        }

        return result;
    }

    public static void main(String[] args)
    {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.createBinaryTree(); 
        System.out.println(binaryTree.findMaximum(binaryTree.root));
    }
}
