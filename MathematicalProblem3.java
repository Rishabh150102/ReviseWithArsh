import java.util.Arrays;

/**
 * MathematicalProblem3
 */
public class MathematicalProblem3 {

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        if(nums[0] <0 && nums[1]<0 && nums[n-1]>=0){
            int m = Math.max(nums[n-1]*nums[0]*nums[1], nums[n-1]*nums[n-2]*nums[n-3]);
            return m;
        }
        if(nums[n-1] >=3 || nums[n-1] <= 0){
            return nums[n-1]*nums[n-2]*nums[n-3];
        }
        return nums[n-1]*nums[n-2]*nums[n-3];
    }

    public static void main(String[] args) {
        //628. Maximum Product of Three Numbers
    }
}