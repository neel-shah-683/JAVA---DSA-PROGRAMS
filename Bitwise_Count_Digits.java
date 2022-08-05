public class Bitwise_Count_Digits {
    public static void main(String[] args) {
        
        int n=6,count=0;
        while(n>0)
        {
            n = n>>1;
            count++;
        }
        System.out.println(count);
    }
}
