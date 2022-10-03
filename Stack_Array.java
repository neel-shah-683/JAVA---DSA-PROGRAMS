public class Stack_Array {

    int Top = -1;
    public void push(int data, int[] a)
    {
        if(Top >= a.length-1)
        {
            System.out.println("Stack is Overflow:");
            return ;
        }
        else
        {
            Top++;
            a[Top] = data;
        }
    }

    public void printStack(int[] a)
    {
        if(Top == -1)
        {
            System.out.println("Stack is Underflow:");
            return ;
        }
        else
        {
            while(Top>=0)
            {
                System.out.println(a[Top]);
                Top--;
            }
        }
    }
    public void pop(int[] a)
    {
        if(Top == - 1)
        {
            System.out.println("Stack is Underflow:");
            return ;
        }
        else
        {
            int x = a[Top];
            Top--;
            System.out.println("\n"+x + " is removed from Stack:");
        }
    }
    public static void main(String[] args) {
        
        Stack_Array sa = new Stack_Array();
        int[] arr = new int[5];

        sa.push(1,arr);
        sa.push(2,arr);
        sa.push(3,arr);
        sa.push(4,arr);
        sa.push(5,arr);

        sa.pop(arr);   
        sa.pop(arr); 

        System.out.println("\nElements Present in the Stack:");
        sa.printStack(arr);

               
    }
}
