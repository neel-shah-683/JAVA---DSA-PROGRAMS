public class Smallest_Letter_Greater_than_Target {
    public static void main(String[] args) {
        
        char [] letters = {'c','f','j'};
        char target='j';
        char ch = nextGreatestLetter(letters,target);
        System.out.println(ch);
    }
    static char nextGreatestLetter(char[] letters, char target)
    {
        int start=0,end = letters.length-1;
        while(start<=end)
        {
            int mid = (start + end) / 2;
            if(target < letters[mid])
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return letters[start%letters.length];
    }
}
