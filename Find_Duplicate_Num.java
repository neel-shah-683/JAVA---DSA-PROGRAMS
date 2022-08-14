public class Find_Duplicate_Num {
    public static void main(String[] args) {
        
        int[] arr = {3, 1, 3, 4, 2};
        int ans = duplicateNum(arr);
        System.out.println(ans);
    }
    static int duplicateNum(int[] nums)
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
                return nums[i];
            }
        }
        return 0;
    }
}
