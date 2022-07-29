public class String_Palindrome_Check {
    public static void main(String[] args) {
        
        String str = "abcdcba";
        checkPalindrome(str);
    }
    static void checkPalindrome(String s)
    {
        boolean val = true;
        if(s==null || s.length()==0)
        {
            val = true;
        }
        else
        {
            for(int i=0,j=s.length()-1;j>i;i++,j--)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    val = true;
                }
                else
                {
                    val = false;
                    break;
                }
            }
        }
        
        if(val==true)
            System.out.println("Palindrome String:");
        else
            System.out.println("Not Palindrome String:");
    }
}
