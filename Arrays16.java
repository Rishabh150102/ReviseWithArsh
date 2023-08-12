/**
 * Arrays16
 */
public class Arrays16 {

    //TC is O(n^2)
    //Can be optimized more
    public int subarraySum(int[] nums, int k) {
        int cnt = 0;
        for(int i=0;i<nums.length;i++){
            int sum = 0;
            for(int j=i;j<nums.length;j++){
                sum += nums[j];
                if(sum == k){
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        //560. Subarray Sum Equals K

    }
}