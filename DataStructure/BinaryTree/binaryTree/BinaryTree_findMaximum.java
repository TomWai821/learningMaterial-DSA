public class BinaryTree_findMaximum 
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
        BinaryTree_findMaximum binaryTree = new BinaryTree_findMaximum();
        binaryTree.createBinaryTree(); 
    }
}
