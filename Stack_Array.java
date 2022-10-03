
public class Stack_Array{

    static class Stack_OP{

        int[] arr;
        int size;        
        int top = -1;
        Stack_OP(int n)
        {
            arr = new int[n];
            this.size = n;
        }

        public boolean isEmpty()
        {
            return top == -1;
        }
        public void push(int data)
        {
            if(top == size - 1)
            {
                System.out.println("Stack is Overflow:");
                return ;
            }
            else
            {
                top++;
                arr[top] = data;
            }
        }
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Underflow:");
                return -1;
            }
            else
            {
                int x = arr[top];
                top--;
                return x;
            }
        }
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Stack is Underflow:");
                return -1;
            }
            else
            {
                return arr[top];
            }
        }
    }
    public static void main(String[] args)
    {
        Stack_OP s1 = new Stack_OP(5);

        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);
        s1.push(5);

        while(!s1.isEmpty())
        {
            System.out.println(s1.peek());
            s1.pop();
        }       
    }
}