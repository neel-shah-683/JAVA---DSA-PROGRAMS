import java.util.ArrayList;
import java.util.Arrays;

public class Find_Number_Disappear_fromArray {
    public static void main(String[] args) {

        int[] arr = { 1, 1 };
        ArrayList<Integer> al = new ArrayList<Integer>();
        al = findNumsDisappear(arr);
        System.out.println(al);
        
    }
    static ArrayList<Integer> findNumsDisappear(int[] nums)
    {
        for(int i=0;i<nums.length;)
        {
            int index = nums[i] - 1;
            if(nums[i]!=nums[index])
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

        ArrayList<Integer> all = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            int index = nums[i] - 1;
            if(i!=index)
            {
                all.add(i+1);
            }
        }
        return all;
    }
}
