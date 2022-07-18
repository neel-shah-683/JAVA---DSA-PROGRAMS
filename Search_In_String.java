import java.util.Arrays;

public class Search_In_String {
    public static void main(String[] args) {
        
        String name = "JAVA DSA";

        System.out.println(Arrays.toString(name.toCharArray()));

        if(name.length() == 0)
        {
            System.out.println("No Elements in an Array");
        }
        else
        {
            linear_search(name);
        }
    }
    static void linear_search(String str)
    {
        char val = 'D';
        int flag=1,index=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i) == val)
            {
                flag=1;
                index = i;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if (flag == 1) {
            System.out.println("Value " + val + " Found at Position = " + index);
        } else {
            System.out.println("Value " + val + " Not Found");
        }
    }
}
