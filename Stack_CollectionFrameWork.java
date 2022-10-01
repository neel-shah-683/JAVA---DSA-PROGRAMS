import java.util.Stack;

public class Stack_CollectionFrameWork {
    
    public static void main(String[] args) {
        
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.push(6);

    if(s.isEmpty())
    {
        System.out.println("Stack is Empty:");
    }
    else
    {
        while(!s.isEmpty())
        {
            System.out.print(s.peek()+" ");
            s.pop();
        }
    }
    }
}
