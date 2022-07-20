import java.util.Arrays;

public class Shuffle_the_Array {
    public static void main(String[] args) {
        
        int [] arr = {2, 5, 1, 3, 4, 7};
                   //x1  x2 x3 y1 y2 y3
                   //0   1  2  3  4  5
        int n = 3;
        int[] ans = shuffle(arr,n);
        System.out.println(Arrays.toString(ans));
    }
    static int[] shuffle(int [] nums, int n)
    {
        int [] ans = new int[2*n];
        for(int i=0;i<n;i++)
        {
            ans[2*i] = nums[i];
            ans[2*i+1] = nums[n+i];
        }
        return ans;
    }
}
