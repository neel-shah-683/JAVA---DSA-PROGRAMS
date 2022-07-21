import java.util.Arrays;

public class Nums_smaller_than_current {
    public static void main(String[] args) {
        
        int [] arr = {6, 5, 4, 8};
        int [] ans =nums_small(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] nums_small(int[] nums)
    {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int count=0;

            for(int j=0;j<nums.length;j++)
            {
                if(nums[j] < nums[i])
                {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;

    }
}
