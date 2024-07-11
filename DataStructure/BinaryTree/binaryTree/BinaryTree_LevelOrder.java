import java.util.*;

public class BinaryTree_LevelOrder 
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

    public void LevelOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while(!queue.isEmpty())
        {
            TreeNode temp = queue.poll();
            System.out.println(temp.data);

            if(temp.left != null)
            {
                queue.add(temp.left);
            }

            if(temp.right != null)
            {
                queue.add(temp.right);
            }
        }
    }

    public static void main(String[] args)
    {
        BinaryTree_LevelOrder binaryTree = new BinaryTree_LevelOrder();
        binaryTree.createBinaryTree(); 
    }
}
