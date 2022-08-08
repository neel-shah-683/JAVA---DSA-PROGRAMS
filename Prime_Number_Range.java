public class Prime_Number_Range {
    public static void main(String[] args) {
        
        int num = 40;
        rangePrime(num);
    }
    static void rangePrime(int n)
    {
        if(n<=1)
            System.out.println(-1);

        for(int i=2;i<n;i++)
        {
            if(isPrime(i))
                System.out.println(i);
        }
    }
    static boolean isPrime(int i1)
    {
        for(int i=2;i<i1;i++)
        {
            if(i1%i==0)
                return false;
        }
        return true;
    }
}
