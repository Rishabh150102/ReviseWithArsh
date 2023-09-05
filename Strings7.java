import java.util.ArrayList;
import java.util.List;

/**
 * Strings7
 */
public class Strings7 {

    public void func(int n, List<String> ans, int open, int close, String s){
        //base case
        if(s.length() == 2*n){
            ans.add(s);
            return;
        }

        if(open<n){
            func(n, ans, open+1, close, s + "(");
        }
        if(close < open){
            func(n, ans, open, close+1, s + ")");
        }
        
    }

    public List<String> generateParenthesis(int n) {
        //using backtracking method.
        List<String> ans = new ArrayList<>();
        func(n, ans, 0, 0, "");
        return ans;
    }

    public static void main(String[] args) {
        //22. Generate Parentheses

    }
}