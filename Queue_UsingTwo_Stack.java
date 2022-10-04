import java.util.*;
public class Queue_UsingTwo_Stack {
    

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    
    public boolean isEmpty()
    {
        return s1.isEmpty();
    }
    public void add(int data)
    {
        while(!s1.isEmpty())
        {
            s2.push(s1.pop());
        }
        s1.push(data);

        while(!s2.isEmpty())
        {
            s1.push(s2.pop());
        }
    }
    public void pop()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is Empty:");
            return ;
        }
        s1.pop();
    }
    public int peek()
    {
        if(s1.isEmpty())
        {
            System.out.println("Queue is Empty:");
            return -1;
        }
        return s1.peek();
    }
    public static void main(String[] args) {
        
        Queue_UsingTwo_Stack q = new Queue_UsingTwo_Stack();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.pop();
        }

    }
}
