import java.util.*;
import java.util.LinkedList;

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
    
    public int countNodes(Node root)
    {
        if(root == null)
            return 0;
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;
    }
    public int sumNodes(Node root)
    {
        if(root == null)
            return 0;
        int left = sumNodes(root.left);
        int right = sumNodes(root.right);

        return left + right + root.data;
                
    }
    
    public int MaxheightTree(Node root)
    {
        //Also Possible using level order traversal
        if(root == null)
            return 0;
        int left = MaxheightTree(root.left);
        int right = MaxheightTree(root.right);

        return Math.max(left, right) + 1;        
    }
    public int MinheightTree(Node root)
    {
        if(root == null)
            return 0;
        
        int left = MinheightTree(root.left);
        int right = MinheightTree(root.right);

        return (left == 0 || right == 0)? left + right + 1 : Math.min(left,right) + 1;
    }
    public int diameter(Node root)
    {
        if(root == null)
            return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        int diameter = MaxheightTree(root.left) + MaxheightTree(root.right);

        return Math.max(diameter, Math.max(left, right));
    }int sum = 0;
    public void levelOrder1(Node root)
    {
        if(root == null)
            return ;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);

        while(!q.isEmpty())
        {
            Node currnode = q.remove();

            if(currnode == null)
            {
                System.out.println();
                if(q.isEmpty())
                    break;
                else
                    q.add(null);
            }
            else
            {
                sum += currnode.data;
                System.out.print(currnode.data+" ");
                if(currnode.left != null)
                    q.add(currnode.left);
                if(currnode.right!=null)
                    q.add(currnode.right);
            }
            
        }
        System.out.println(sum);
    }
    public List<List<Integer>> levelOrder2(Node root)
    {
        Queue<Node> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();

        if(root == null)
            return list;

        q.offer(root);
        while(!q.isEmpty())
        {
            int size = q.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i=0; i<size;i++)
            {
                if(q.peek().left!=null)
                    q.offer(q.peek().left);
                if(q.peek().right!=null)
                    q.offer(q.peek().right);
                sublist.add(q.poll().data);
            }
            list.add(sublist);
        }
        return list;
    }
    public void levelOrder3(Node root)
    {
        if(root == null)
            return ;
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            
            if(q.peek().left!=null)
                q.add(q.peek().left);
            if(q.peek().right!=null)
                q.add(q.peek().right);

            System.out.print(q.poll().data+" ");
        }
    }
    public int sumofNodesKthLevel(Node root, int k)
    {
        if(root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size(), sum = 0, flag = 1;
            for(int i=0; i<size;i++)
            {
                if(k == size - 1)
                {
                    int var = q.poll().data;
                    sum += var;
                    flag = 1;
                }
                else
                {
                    if(q.peek().left!=null)
                        q.offer(q.peek().left);
                    if(q.peek().right!=null)
                        q.offer(q.peek().right);
                    flag = 0;
                    int x = q.poll().data;  
                }
                
            }  
            if(flag==1)
                return sum;        
        }
        return 0;
    }
    public double avgofNodesKthLevel(Node root, int k)
    {
        if(root == null)
            return 0;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty())
        {
            int size = q.size(), flag = 1;
            double sum = 0;
            for(int i=0; i<size;i++)
            {
                if(k == size - 1)
                {
                    int var = q.poll().data;
                    sum += var;
                    flag = 1;
                }
                else
                {
                    if(q.peek().left!=null)
                        q.offer(q.peek().left);
                    if(q.peek().right!=null)
                        q.offer(q.peek().right);
                    flag = 0;
                    int x = q.poll().data;  
                }
                
            }  
            if(flag==1)
                return sum/2;        
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3,-1, 6, -1, -1};

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        System.out.println(root.data);

        System.out.println("\nPreorder Traversal--->");
        bt.preOrder(root);

        System.out.println("\nInorder Traversal--->");
        bt.inOrder(root);

        System.out.println("\nPostorder Traversal--->");
        bt.postOrder(root);

        System.out.println("\nLevel Order Traversal 1--->");
        bt.levelOrder1(root);

        System.out.println("\nLevel Order Traversal 2--->");
        System.out.println(bt.levelOrder2(root)); 

        System.out.println("\nLevel Order Traversal3 --->");
        bt.levelOrder3(root); 

        System.out.println("\nCount Of Nodes--->");
        System.out.println(bt.countNodes(root));

        System.out.println("\nSum Of Nodes--->");
        System.out.println(bt.sumNodes(root));

        System.out.println("\nMax Height of Tree--->");
        System.out.println(bt.MaxheightTree(root));

        System.out.println("\nMin Height of Tree--->");
        System.out.println(bt.MinheightTree(root));

        System.out.println("\nDiameter of Tree--->");
        System.out.println(bt.diameter(root));  
        
        System.out.println("\nSumOfNodes At Kth Level--->");
        System.out.println(bt.sumofNodesKthLevel(root,1)); 
        
        System.out.println("\nAvgOfNodes At Kth Level--->");
        System.out.println(bt.avgofNodesKthLevel(root,2)); 
    }
}