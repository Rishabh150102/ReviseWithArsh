import java.util.Stack;

/**
 * Strings1
 */
public class Strings1 {

    public boolean isValid(String s) {
        Stack<Character> stk= new Stack<>();
        char a;
        
        for(int i=0;i<s.length();i++){
            a = s.charAt(i);
            if(a == '(' || a=='{' || a=='['){
                stk.push(a);
            }else if(stk.empty()){
                return false;
            }else if((s.charAt(i) == ')' && stk.peek() == '(' && !stk.empty()) || (s.charAt(i) == '}' && stk.peek() == '{' && !stk.empty()) || (s.charAt(i) == ']' && stk.peek() == '[' && !stk.empty())){
                stk.pop();
            }
            else{
                return false;
            }
        }
        return stk.empty();
    }
    public static void main(String[] args) {
        //20. Valid Parentheses

    }
}