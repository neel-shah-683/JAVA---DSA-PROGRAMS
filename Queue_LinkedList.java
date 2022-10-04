public class Queue_LinkedList {
    
    Node head, tail;

    Queue_LinkedList()
    {
        this.head = null;
        this.tail = null;
    }
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
        return head == null && tail == null;
    }
    public void push(int data)
    {
        Node newNode = new Node(data);
        if(isEmpty())
        {
          head = tail = newNode;
          return;  
        }
        tail.next = newNode;
        tail = newNode;        
    }
    public void pop()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty:");
            return ;
        }
        if(head == tail)
        {
            head = tail = null;
            return ;
        }
        head = head.next;
    }
    public int peek()
    {
        if(isEmpty())
        {
            System.out.println("Queue is Empty:");
            return -1;
        }  
        return head.data;
    }
    public static void main(String[] args) {
        
        Queue_LinkedList ql = new Queue_LinkedList();
        
        ql.push(1);
        ql.push(2);
        ql.push(3);
        ql.push(4);
        ql.push(5);

        while(!ql.isEmpty())
        {
            System.out.println(ql.peek());
            ql.pop();
        }

    }
}
