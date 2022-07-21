public class Number_of_Good_Pairs {
    public static void main(String[] args) {
        
        int [] arr = {1, 2, 3};
                    //i              j
        int ans = goodpairs(arr);
        System.out.println(ans);
    }
    static int goodpairs(int [] nums)
    {
        int count=0;

        for(int i =0;i<nums.length;i++)
        {
            for(int j=nums.length-1;j>i;j--)
            {
                if(nums[i] == nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}
