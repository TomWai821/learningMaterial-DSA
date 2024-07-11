import java.util.Stack;

public class checkBrackets {
    
    boolean isValid(String s){

        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(c == '[' || c == '(' || c == '{')
            {
                stack.push(c);
            }
            else
            {
                if(stack.isEmpty())
                {
                    return false;
                }
                else
                {
                    char top = stack.peek();

                    if((c == ']' && top == '[') || 
                    (c == ')' && top == '(')|| 
                    (c == '}' && top == '{'))
                    {
                        stack.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
        }
        System.out.println("This string is valid!");
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        checkBrackets cb = new checkBrackets();
        cb.isValid("()");
    }

}
