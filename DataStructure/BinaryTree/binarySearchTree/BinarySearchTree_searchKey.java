
public class BinarySearchTree_searchKey 
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

    public TreeNode searchKey(int key)
    {
        return searchKey(root, key);
    }

    public TreeNode searchKey(TreeNode root, int key)
    {
        if(root == null || root.data == key)
        {
            return root;
        }

        if(root.data < key)
        {
            return searchKey(root.right, key);
        }
        else
        {
            return searchKey(root.left, key);
        }
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
        BinarySearchTree_searchKey bsf = new BinarySearchTree_searchKey();
        bsf.insert(5);
        bsf.insert(7);
        bsf.insert(9);
        bsf.insert(8);
        bsf.insert(3);
        
        if (null != bsf.searchKey(5))
        {
            System.out.println("The key is found");
        }
        else
        {
            System.out.println("The key not found");
        }

    }
}
