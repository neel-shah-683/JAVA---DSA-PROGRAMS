public class CircularQueue_Array {
    
    static class CircularQueue{
        static int[] a;
        int size;
        static int rear = -1, front = -1;
        CircularQueue(int n)
        {
            a = new int[n];
            this.size = n;
        }

        public boolean isEmpty()
        {
            return rear == -1 && front == -1;
        }
        public boolean isFull()
        {
            return (rear+1) % size == front; 
        }
        public void push(int data)
        {
            if(isFull())
            {
                System.out.println("Queue Overflow:");
                return ;
            }
            else
            {
                if(front == -1)
                {
                    front = 0;
                }
                rear = (rear + 1) % size;
                a[rear] = data;
            }
        }
        public int pop()
        {
            if(isEmpty())
            {
                System.out.println("Queue Underflow:");
                return -1;
            }
            else
            {
                int x = a[front];
                if(rear == front)
                {
                    rear = front = -1;
                }
                else
                {
                    front = (front+1) % size;
                }
                return x;
            }
        }
        public int peek()
        {
            if(isEmpty())
            {
                System.out.println("Queue is Underflow:");
                return -1;
            }
            return a[front];
        }
    }
    public static void main(String[] args) {
        
        CircularQueue cq = new CircularQueue(5);

        cq.push(1);
        cq.push(2);
        cq.push(3);
        cq.push(4);
        cq.push(5);


        cq.pop();

        cq.push(6);

        while(!cq.isEmpty())
        {
            System.out.println(cq.peek());
            cq.pop();
        }

    }
}
