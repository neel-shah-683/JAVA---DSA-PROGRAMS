import java.util.Arrays;

public class First_Missing_Positive {
    public static void main(String[] args) {
        int[] arr = {7,8,9,10};
         int ans = missingPositive(arr);
        System.out.println(ans);
    }
    static int missingPositive(int[] nums)
    {
        for(int i=0;i<nums.length;)
        {
            int index = nums[i]-1;
            if(nums[i] > 0 && nums[i]<=nums.length && nums[i]!=nums[index])
            {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
            }
            else 
            {
                i++;
            }            
        }
        System.out.println(Arrays.toString(nums));

        
        for(int i=0;i<nums.length;i++)
        {
            int index = nums[i] - 1;
            if(i!=index)
            {
              return i+1; 
            }
        }
       return nums.length+1;
    }
}
