// Question 03-Valid Parentheses
// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is 
// valid.
// An input string is valid if:
// Open brackets must be closed by the same type of brackets.
// Open brackets must be closed in the correct order.
// Every close bracket has a corresponding open bracket of the same type.



import java.util.*;
public class Question03 
{
    public boolean isValid(String s) 
    {
        Stack<Character> a=new Stack<Character>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!a.isEmpty() && ch=='}' && a.peek()=='{' )
            {
                a.pop();
            }
            else
            if(!a.isEmpty() && ch==']' && a.peek()=='[' )
            {
                a.pop();
            }
            else
            if(!a.isEmpty() && ch==')' && a.peek()=='(' )
            {
                a.pop();
            }
            else
            {
                a.push(ch);
            }
        }
        return a.isEmpty();
    }
}