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
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
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

    public void insertAtAnyIndex(int data, int index)
    {
        if(index==0)
        {
            addFirst(data);
            return ;
        }
        if(index==size)
        {
            addLast(data);
            return ;
        }

        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        Node newNode = new Node(data,temp.next);
        temp.next = newNode;
        size++;

    }
    public void deleteAny(int index)
    {
        if(index==0)
        {
            deleteFirst();
            return ;
        }
        if(index==size-1)
        {
            deleteLast();
            return ;
        }

        Node temp = head;
        for(int i=1;i<index;i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
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
        list.addLast(25);

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

        list.insertAtAnyIndex(100, 3);
        list.printList();

        System.out.println();
        list.deleteAny(3);
        list.printList();
    }
}