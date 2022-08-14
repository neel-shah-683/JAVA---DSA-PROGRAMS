import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        
        int[] arr = {3, 2, 2};
        int[] ans = setMismatch(arr);
        System.out.println(Arrays.toString(ans));
    }
    static int[] setMismatch(int[] nums)
    {
        for(int i=0;i<nums.length;)
        {
            int correctIndex = nums[i] - 1;
            if(nums[i]!=nums[correctIndex])
            {
                int temp = nums[i];
                nums[i] = nums[correctIndex];
                nums[correctIndex] = temp;
            }
            else
            {
                i++;
            }
        }
        for(int i=0;i<nums.length;i++)
        {
            int correctIndex = nums[i] - 1;
            if(i!=correctIndex)
            {
                return new int[] {nums[i],i+1};
            }
        }
        return new int[] {-1,-1};
    }
}
