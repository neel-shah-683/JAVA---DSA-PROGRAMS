public class Bitwise_Even_Odd {
    public static void main(String[] args) {
        
        int n = 1;
        boolean ans = even_odd_check(n);
        System.out.println(ans);
    }
    static boolean even_odd_check(int num)
    {
        return (num & 1) == 0;
    }
}
