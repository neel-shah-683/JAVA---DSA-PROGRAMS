public class Check_Pangram_Sentence {
    public static void main(String[] args) {
        
        String str = "abcdefghijklmnopqrstuvwxyz";

        boolean ans = pangram(str);
        System.out.println(ans);
    }
    static boolean pangram(String sentence)
    {
        if(sentence.length() < 26)
        {
             return false;
        }  
        else
        {
         for(char ch='a'; ch<='z';ch++)
         {
              if(sentence.indexOf(ch)<0)
              {
                  return false;
              }
         }
        }
        
        return true;
    }
}
