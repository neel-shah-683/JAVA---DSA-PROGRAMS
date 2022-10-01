import java.util.ArrayList;

public class Stack_ArrayList {
 

    static ArrayList<Integer> al = new ArrayList<>();

    public boolean isEmpty()
    {
        return al.size() == 0;
    }
    public void push(int data)
    {
        al.add(data);
    }
    public void pop()
    {
        al.remove(al.size() - 1);
    }
    public void peek()
    {
        int top = al.get(al.size() - 1);
        System.out.print(top+" ");
    }
    public static void main(String[] args) {
        Stack_ArrayList sa = new Stack_ArrayList();
        
        sa.push(1);
        sa.push(2);
        sa.push(3);
        sa.push(4);
        sa.push(5);
        
        System.out.println(al);

        if(sa.isEmpty())
        {
            System.out.println("Stack is Empty:");
        }
        else
        {
            while(!sa.isEmpty())
            {
                sa.peek();
                sa.pop();
            }
        }
    }
}
