public class NumbersSteps_toReduce0 {

    public static void main(String[] args) {
        
        int n=8;
        int ans = numberOfSteps(n);
        System.out.println(ans);
    }
    static int count=0;
    static int numberOfSteps(int num)
    { 
        if(num==0)
            return count;

        if(num%2==0)
        {
            count++;
            return numberOfSteps(num/2);
        }
        else
        {
            count++;
            return numberOfSteps(num-1);
        }
    }
}
