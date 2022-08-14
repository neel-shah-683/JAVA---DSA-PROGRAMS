import java.util.ArrayList;
import java.util.Collections;

public class Find_All_Duplicates {
    public static void main(String[] args) {

        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        ArrayList<Integer> all = new ArrayList<Integer>();
        all = findAllDuplicates(arr);
        
        System.out.println(all);
    }
    static ArrayList<Integer> findAllDuplicates(int[] nums)
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
        ArrayList<Integer> all = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            int correctIndex = nums[i] - 1;
            if(i!=correctIndex)
            {
                all.add(nums[i]);
            }
        }
        Collections.sort(all);
        return all;
    }
}
