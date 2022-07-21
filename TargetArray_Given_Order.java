import java.util.ArrayList;
import java.util.Arrays;

public class TargetArray_Given_Order {
    public static void main(String[] args) {
        
        int[] arr = {0, 1, 2, 3, 4};
        int[] indx= {0, 1, 2, 2, 1};
        int ans[] = targetarray(arr,indx);
        System.out.println(Arrays.toString(ans));
    }
    static int[] targetarray(int[] nums, int[] index)
    {
        ArrayList<Integer> ans = new ArrayList<Integer>();

        for(int i=0;i<nums.length;i++)
        {
            ans.add(index[i], nums[i]);
        }
        int[] target = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            target[i] = ans.get(i);
        }
        return target;
    }
}
