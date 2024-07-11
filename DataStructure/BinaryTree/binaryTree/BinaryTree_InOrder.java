import java.util.*;

public class BinaryTree_InOrder 
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

    public static void main(String[] args)
    {
        BinaryTree_InOrder binaryTree = new BinaryTree_InOrder();
        binaryTree.createBinaryTree(); 
    }
}
