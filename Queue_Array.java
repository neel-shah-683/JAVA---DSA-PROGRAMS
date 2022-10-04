public class Queue_Array {
    
    static class Queue{
        static int[] arr;
        int size;
        static int rear = -1, front = -1;

        Queue(int n)
        {
            arr = new int[n];
            this.size = n; 
        }
        public boolean isEmpty()
        {
            return rear == - 1;
        }
        //enqueue
        public void push(int data)
        {
            if(rear == size - 1)
            {
                System.out.println("Queue is Overflow:");
                return ;
            }
            else
            {
                if(front==-1)
                {
                    front = 0;
                }
                rear++;
                arr[rear] = data;
            }
        }
        //dequeue
        public int pop()
        {
            if(rear == -1)
            {
                System.out.println("Queue is Underflow:");
                return -1;
            }
            else
            {
                int x = arr[front];
                if(rear==front)
                    rear=front=-1;
                else
                {
                    front++;
                }
                return x;
            }
        }
        public int peek()
        {
            if(rear==-1)
            {
                System.out.println("Queue is Empty:");
                return -1;
            }
            return arr[front];
        }
    }
    public static void main(String[] args) {
        
        Queue q = new Queue(4);

        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);

        while(!q.isEmpty())
        {
            System.out.println(q.peek());
            q.pop();
        }


    }
}
