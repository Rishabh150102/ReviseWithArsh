/**
 * Strings5
 */
public class Strings5 {

    public boolean remainingPalindrome(String s, int l, int r){
        while(l < r){
            char first = s.charAt(l);
            char last = s.charAt(r);
            if(first == last){
                l++; r--;
            }else{
                return false;
            }
        }
        return true;
    }

    public boolean validPalindrome(String s) {
        int i = 0, j = s.length()-1, pt = -1;

        if(s.length() == 1){
            return true;
        }

        while(i<j){
            char first = s.charAt(i);
            char last = s.charAt(j);
            if(first == last){
                i++; j--;
            }
            else{
                //checking the remaining part of the string for palindrome.
                //with i+1 we are removing one character from left 
                //with j-1 we are removing one character from right
                //and then OR operator between them.
                return remainingPalindrome(s, i+1, j) || remainingPalindrome(s, i, j-1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        //680. Valid Palindrome II

    }
}