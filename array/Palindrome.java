public class Palindrome{

    public boolean checkPalindrome(String string){
        char[] toChar = string.toCharArray();
        int start = 0;
        int end = string.length() - 1;

        if(start < end){
            if(toChar[start] != toChar[end]){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args){
        
        String string = "123321";

        Palindrome p = new Palindrome();

        if(p.checkPalindrome(string) == true)
        {
            System.out.println(string + " is palindrome!");
        }
        else
        {
            System.out.println(string + " is not palindrome!");
        };
    } 
}