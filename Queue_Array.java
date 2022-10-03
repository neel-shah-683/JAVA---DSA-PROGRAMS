public class Queue_Array {
    
    static class Queue{
        static int[] arr;
        int size;
        static int rear = -1;

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
                int front = arr[0];
                for(int i=0;i<rear;i++)
                {
                    arr[i] = arr[i+1];
                }
                rear--;
                return front;
            }
        }
        public int peek()
        {
            if(rear==-1)
            {
                System.out.println("Queue is Empty:");
                return -1;
            }
            return arr[0];
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
