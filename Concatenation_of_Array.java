import java.util.Arrays;

public class Concatenation_of_Array {
    public static void main(String[] args) {
        
        int[] arr = {1, 3, 2, 1};

        int[] ans = concate(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int [] concate(int[] nums)
    {
        int [] ans = new int[2*nums.length];

        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }
        return ans;
    }
}
