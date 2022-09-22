public class LinkedList{

    Node head;
    private int size;

    LinkedList()
    {
        this.size = 0;
    }
    class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            size++;
        }   
    }
    //Add at First
    public void addFirst(int data)
    {
        Node newNode = new Node(data);
        
        if(head == null)
        {
            head = newNode;
            return ;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data)
    {
        Node newNode = new Node(data);
        if(head == null)
        {
            head = newNode;
            return ;
        }

        Node temp = head;
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void deleteFirst()
    {
        if(head == null)
        {
            System.out.println("List is Empty:");
            return ;
        }
        size--;
        head = head.next;
    }

    public void deleteLast()
    {
        if(head == null)
        {
            System.out.println("List is Empty:");
            return ;
        }

        size--;
        if(head.next == null)
        {
            head = null;
            return ;
        }

        Node secondlast = head;
        Node last = head.next;
        while(last.next!=null)
        {
            last = last.next;
            secondlast = secondlast.next;
        }
        secondlast.next = null;
    }

    public int getSize()
    {
        return size;
    }
    public void printList()
    {
        if(head == null)
        {
            System.out.println("List is Empty:");
            return ;
        }

        Node temp = head;
        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.print("NULL");

    }
    
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.addFirst(5);
        list.addFirst(10);
        list.addLast(15);
        list.addLast(20);

        list.printList();

        list.deleteFirst();
        System.out.println();
         list.printList();

         list.deleteLast();
         System.out.println();
         list.printList();
        
        System.out.println("\nSize = "+list.getSize());
        list.addFirst(25);
        list.printList();
        System.out.println("\nSize = "+list.getSize());
    }
}