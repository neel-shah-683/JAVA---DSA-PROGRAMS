public class Fibonacci_Sequence {
    public static void main(String[] args) {
        
        int ans = fibo_seq(6);
        System.out.println(ans);
    }
    static int fibo_seq(int n)
    {
        if(n<2)
        {
            return n;
        }
        return fibo_seq(n-1) + fibo_seq(n-2);
    }
}
