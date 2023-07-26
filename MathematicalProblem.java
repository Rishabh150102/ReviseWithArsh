/**
 * MathematicalProblem
 */
public class MathematicalProblem {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        long ans = n*(n+1)/2;
        for(int i=0;i<n;i++){
            ans -= nums[i];
        }
        return (int)ans;
    }

    public static void main(String[] args) {
        //268. Missing Number

    }
}