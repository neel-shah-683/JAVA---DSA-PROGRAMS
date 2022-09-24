public class DoublyLinkedList {
    
    Node head;
    int size;
    DoublyLinkedList()
    {
        this.size = 0;
    }
    class Node{

        int data;
        Node next, prev;

        Node(int data)
        {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
        Node(int data, Node next)
        {
            this.data = data;
            this.next = next;
            size++;
        }
    }

    public void addFirst(int data)
    {
        Node newNode = new Node(data);

        if(head == null)
        {
            head = newNode;
            return ;
        }
        newNode.next = head;
        newNode.prev = null;
        head.prev = newNode;
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
        while(temp.next != null)
        {
            temp =  temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        newNode.next = null;
    }
    public void insertAny(int data, int index)
    {
        if(index == 0)
        {
            addFirst(data);
            return ;
        }
        if(index == size)
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
    public void insertAfterGivenIndex(int data, int index)
    {
        if(head == null)
        {
            System.out.println("List is Empty:");
            return ;
        }
        Node temp = head;
        Node newNode = new Node(data);

        for(int i=1;i<=index;i++)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        newNode.prev = temp;
        if(newNode.next!=null)
        {
            newNode.next.prev = newNode;
        }
    }
    public void printList(){

        Node temp = head;
        Node last = null;

        if(head == null)
        {
            System.out.println("List is Empty:");
            return ;
        }

        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            last = temp;
            temp = temp.next;            
        }
        System.out.print("Null");

        System.out.println("\n\nPrinting Reverse LinkedList:");

        while(last!=null)
        {
            System.out.print(last.data+" -> ");
            last = last.prev;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        
        DoublyLinkedList dl = new DoublyLinkedList();

        dl.addFirst(5);
        dl.addFirst(10);
        dl.addFirst(15);
        dl.addFirst(20);

        dl.addLast(25);
        dl.addLast(30);
        dl.printList();

        System.out.println();
        dl.insertAny(35, 6);
        dl.printList();

        System.out.println();
        dl.insertAfterGivenIndex(40,6);
        dl.printList();
    }
}
