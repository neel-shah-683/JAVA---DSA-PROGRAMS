import java.util.Arrays;

public class NumbersDisappear {
    
    public static void main(String[] args)
    {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        nums_dis(arr);
    }
    static void nums_dis(int[] nums)
    {
        for(int i=0;i<nums.length;)
        {
            int rightIndex = nums[i] - 1;
            if(i!=rightIndex)
            {
                int temp = nums[i];
                nums[i] = nums[rightIndex];
                nums[rightIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
