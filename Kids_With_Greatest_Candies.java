import java.util.ArrayList;
import java.util.List;

public class Kids_With_Greatest_Candies {
    public static void main(String[] args) {
        
        int[] arr = {4, 2, 1, 1, 2};
        int ex_candies = 1;
        List<Boolean> ans = kidsWithCandies(arr,ex_candies);
        System.out.println(ans);
    }
    static List<Boolean> kidsWithCandies(int[] candies,int ex_candies)
    {
        List<Boolean> result = new ArrayList<>(candies.length);
            
        int max = 0;
        for(int i=0;i<candies.length;i++)
        {
            if(max < candies[i])
            {
                max = candies[i];
            }
        }
        for(int k=0;k<candies.length;k++)
        {
            int sum = candies[k] + ex_candies;
            if(sum >= max)
            {
                result.add(true);
            }
            else
            {
                result.add(false);
            }
        }
        return result;
    }
}
