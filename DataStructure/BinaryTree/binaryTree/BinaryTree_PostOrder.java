import java.util.*;

public class BinaryTree_PostOrder 
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

    public void PostOrder(TreeNode root)
    {   
        if(root == null)
        {
            return;
        }

        PostOrder(root.left);

        PostOrder(root.right);

        System.out.println(root.data);
    }

    public void PostOrderWithStack(TreeNode root)
    {
        Stack<TreeNode> stack = new Stack<TreeNode>();

        TreeNode current = root;

        while(!stack.isEmpty() || current != null)
        {
            if(current != null)
            {
                stack.push(current);
                current = current.left;
            }
            else
            {
 
                TreeNode temp = stack.peek().right;

                if(temp == null)
                {
                    temp = stack.pop();
                    System.out.println(temp.data + "");
                    
                    while(!stack.isEmpty() && temp == stack.peek().right)
                    {
                        temp = stack.pop();
                        System.out.println(temp.data + "");
                    }
                }
                else
                {

                    current = temp;
                }
            }
        }
    }


    public static void main(String[] args)
    {
        BinaryTree_PostOrder binaryTree = new BinaryTree_PostOrder();
        binaryTree.createBinaryTree(); 
    }
}
