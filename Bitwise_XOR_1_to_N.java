public class Bitwise_XOR_1_to_N {
    public static void main(String[] args) {
        
        int n=9, ans=0;
        for(int i=3;i<=n;i++)
        {
            ans = ans ^ i;
        }
        System.out.println(ans);
    }
}
