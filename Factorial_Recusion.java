public class Factorial_Recusion {
    public static void main(String[] args) {
        
        int ans = fact_recur(6);
        System.out.println(ans);
    }
    static int fact_recur(int n)
    {
        if(n<1)
        {
            return 1;
        }
        return n * fact_recur(n-1);
    }
}
