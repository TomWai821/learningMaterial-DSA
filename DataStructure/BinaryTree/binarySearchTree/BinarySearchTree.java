public class BinarySearchTree 
{
    TreeNode root;

    public class TreeNode
    {
        TreeNode left;
        int data;
        TreeNode right;

        public TreeNode(int data)
        {
            this.data = data;
        }
    }

    public void insert(int value)
    {
        root = insert(root, value);
    }

    private TreeNode insert(TreeNode root, int value)
    {
        if(root == null)
        {
            root = new TreeNode(value);
            return root;
        }

        if(root.data > value)
        {
            root.left = insert(root.left, value);
        }
        else
        {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public void inOrder()
    {
        inOrder(root);
    }

    public void inOrder(TreeNode root)
    {
        if(root == null)
        {
            return;
        }

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public static void main(String[] args)
    {
        BinarySearchTree bsf = new BinarySearchTree();
        bsf.insert(5);
        bsf.insert(7);
        bsf.insert(9);
        bsf.insert(8);
        bsf.insert(3);
        
        bsf.inOrder();
    }
}

