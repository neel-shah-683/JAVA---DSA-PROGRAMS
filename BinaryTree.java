public class BinaryTree
{
    int index = -1;
    class Node{
        int data;
        Node left;
        Node right;

        Node(int data)
        {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public Node buildTree(int[] nodes)
    {
        index++; 
        if(nodes[index] == -1)
        {
            return null;
        }
        Node newNode = new Node(nodes[index]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;
    }

    public void preOrder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(Node root)
    {
        if(root==null)
        {
            return ;
        }
        inOrder(root.left);   
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public void postOrder(Node root)
    {
        if(root == null)
        {
            return ;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println(root.data);

        System.out.println("\nPreorder Traversal--->");
        bt.preOrder(root);

        System.out.println("\nInorder Traversal--->");
        bt.inOrder(root);

        System.out.println("\nPostorder Traversal--->");
        bt.postOrder(root);
    }
}