public class Nth_Magic_Number {
    public static void main(String[] args) {
        
        int n = 6,base=5,ans=0;
        while(n > 0)
        {
            int last = n & 1;
            ans = ans + base * last;
            n = n>>1;
            base = base * 5;
        }
        System.out.println(ans);
    }
}
