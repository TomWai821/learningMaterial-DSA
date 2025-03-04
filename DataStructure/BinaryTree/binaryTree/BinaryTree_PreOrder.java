import java.util.*;

public class BinaryTree_PreOrder 
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

    public static void main(String[] args)
    {
        BinaryTree_PostOrder binaryTree = new BinaryTree_PostOrder();
        binaryTree.createBinaryTree(); 
    }
}
