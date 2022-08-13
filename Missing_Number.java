
public class Missing_Number {
    public static void main(String[] args) {
        
        int[] arr = {0, 2};
        int ans = missingNum(arr);
        System.out.println(ans);
    }
    static int missingNum(int[] nums)
    {
        for(int i=0;i<nums.length;)
        {
            int correctIndex = nums[i];
            if(nums[i] < nums.length && i!=correctIndex)
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
            int correctIndex = nums[i];
            if(i!=correctIndex)
            {
                return i;
            }
        }      
        return nums.length;
    }
}
