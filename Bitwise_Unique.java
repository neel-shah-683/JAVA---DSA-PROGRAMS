public class Bitwise_Unique {
    public static void main(String[] args) {
        
        int[] arr = {2, 3, 3, 4, 2, 7, 4};
        int ans = checkUnique(arr);
        System.out.println(ans);
    }
    static int checkUnique(int[] a)
    {
        int ans = 0;

        for(int i=0;i<a.length;i++)
        {
            ans = ans ^ a[i];
        }
        return ans;
    }
    
}
