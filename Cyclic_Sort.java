import java.util.Arrays;

public class Cyclic_Sort{
    public static void main(String[] args) {
        
        int[] arr = {2, 4, 3, 1, 5, 6};
        cyclic_sort(arr);
    }
    static void cyclic_sort(int[] nums)
    {
        for(int i=0;i<nums.length;)
        {
            int rightIndex = nums[i]-1;
            if(i!=rightIndex)
            {
                int temp = nums[i];
                nums[i] = nums[rightIndex];
                nums[rightIndex] = temp;
            }
            else
            {
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}