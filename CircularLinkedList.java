public class CircularLinkedList {
    
    Node head, tail;
    CircularLinkedList()
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
        }
    }
    public void insert(int data)
    {
        Node newNode = new Node(data);
        if(head==null)
        {
            head = newNode;
            tail = newNode;
            return ;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }
    public void delete(int index)
    {
        if(head==null)
        {
            System.out.println("List is Empty:");
            return ;  
        }

        if(index==0)
        {
            head = head.next;
            tail.next = head;
            return ;
        }

        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void display()
    {
        if(head==null)
        {
            System.out.println("List is Empty:");
            return ;
        }
        
        Node temp = head;
        do
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }while(temp!=head);
        System.out.print("HEAD");
    }
    public static void main(String[] args) {

        CircularLinkedList cl = new CircularLinkedList();

        cl.insert(23);
        cl.insert(3);
        cl.insert(19);
        cl.insert(75);
        
        cl.display();

        System.out.println();
        cl.delete(2);
        cl.display();
    }
}
