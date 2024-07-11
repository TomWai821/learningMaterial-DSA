import java.util.Stack;
import java.util.Scanner;

public class ReverseString 
{

    public static void main(String[] args) {

        ReverseString reverseString = new ReverseString();
        reverseString.inputString();
    }

    private void inputString()
    {   
        System.out.print("Please input string:");
        Scanner s = new Scanner(System.in);
        String input = s.next();

        Reverse(input);
    }

    private void Reverse(String input)
    {
        Stack<Character> stack = new Stack<Character>();
        char[] inputChar = input.toCharArray();

        for(char c : inputChar)
        {
            stack.push(c);
        }

        for(int i = 0; i < inputChar.length; i++)
        {
            inputChar[i] = stack.pop();
        }
        
        System.out.println(inputChar);
    }
}
