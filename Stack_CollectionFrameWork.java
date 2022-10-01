import java.util.Stack;

public class Stack_CollectionFrameWork {
    
    public static void pushAtButtom(int data, Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(data);
            return ;
        }
        int top = s.pop();
        pushAtButtom(data, s);
        s.push(top);
    }      
    public  static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            return ;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtButtom(top, s);
    } 
    public static void main(String[] args) {
        
    Stack<Integer> s = new Stack<>();
    s.push(1);
    s.push(2);
    s.push(3);

    reverseStack(s);
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
