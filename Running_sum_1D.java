import java.util.Arrays;

public class Running_sum_1D {
    public static void main(String[] args) {
        
        int [] arr = {3, 1, 2, 10, 1};//1, 3, 6, 10
        int [] ans = sum_1d(arr);
        System.out.println(Arrays.toString(ans));
     }
     static int [] sum_1d(int[] nums){

        int [] sum = new int[nums.length];

        sum[0] = nums[0];
        for(int i=1;i<nums.length;i++)
        {
            sum[i] = sum[i-1] + nums[i];
        }
        return sum;
     }
}
