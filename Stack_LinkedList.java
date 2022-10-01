public class Stack_LinkedList {
    
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public void push(int data)
    {
        Node newNode = new Node(data);

        if(isEmpty())
        {
            head = newNode;
            System.out.print(head.data+" ");
            return ;
        }
        newNode.next = head;
        head = newNode;
        System.out.print(head.data+" ");
    }
    public void pop()
    {
        head = head.next;
    }
    public void peek()
    {
        int top = head.data;
        System.out.print(top+" ");
    }
    public static void main(String[] args)
    {
        Stack_LinkedList sl = new Stack_LinkedList();

        System.out.println("Elements in Stack ---> ");
        sl.push(1);
        sl.push(2);
        sl.push(3);
        sl.push(4);
        sl.push(5);
        sl.push(6);


        if(sl.isEmpty())
        {
            System.out.println("Stack is Empty:");
        }
        else
        {
            System.out.println("\nElements Removing From the Stack:");

            while(!sl.isEmpty())
            {
                sl.peek();
                sl.pop();
            }
        }      
        
    }
}
