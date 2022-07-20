import java.util.Arrays;

public class Build_Array_from_Permutation {
 
    public static void main(String[] args) {
        
        int [] arr = {5, 0, 1, 2, 3, 4};

        int[] ans = permutation(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] permutation(int[] nums)
    {
        int [] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

}
