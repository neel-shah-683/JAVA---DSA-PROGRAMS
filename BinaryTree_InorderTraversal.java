import java.util.*;

public class BinaryTree_InorderTraversal {
    
    int index = -1;
    List<Integer> al = new ArrayList<>();
    class Node
    {
        int data;
        Node left;
        Node right;
        Node(int data)
        {
            this.data = data;
        }
        Node(int data, Node left, Node  right)
        {
            this.data = data;
            this.left = left;
            this.right =right;
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
    public List<Integer> inorderTraversal(Node root)
    {
        if(root == null)
        {
            return al;
        }
        inorderTraversal(root.left);
        al.add(root.data);
        inorderTraversal(root.right);
                
        return al;
    }
    public static void main(String[] args) {
        
        int[] nodes = {1, -1, 2, 3, -1, -1, 4, -1, -1};
        BinaryTree_InorderTraversal bt = new BinaryTree_InorderTraversal();
        Node root = bt.buildTree(nodes);
        System.out.println(root.data);


        List<Integer> al = bt.inorderTraversal(root);
        
        System.out.println(al);
    }
}
