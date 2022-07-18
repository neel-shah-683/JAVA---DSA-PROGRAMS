public class Richest_Customer_Wealth {
    public static void main(String[] args) {
        
        int [][] accounts = {
            {1, 2,4},//7
            {3, 2, 1},//6
            {4, 5, 6}//15
        };
        int ans = maximumWealth(accounts);
        System.out.println("Max = "+ans);
    }   
    static int maximumWealth(int[][] accounts)
    {
        int max=0;
        for(int i=0;i<accounts.length;i++)
        {
            int sum=0;

            for(int j=0;j<accounts[i].length;j++)
            {
                sum = sum + accounts[i][j];
            }
            if(sum > max)
            {
                max=sum;
            }
        }
        return max;
    }
}
