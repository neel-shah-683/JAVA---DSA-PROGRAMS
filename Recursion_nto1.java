public class Recursion_nto1 {
    public static void main(String[] args) {
        
        int num = 302100004;
        int ans = countZERO(num);    
        System.out.println(ans);
    }
    static int count=0;
    static int countZERO(int n)
    {
        if(n==0) 
            return count;
        if(n%10==0)
        {
            count++;
        }
        return countZERO(n/10);
    }
}
