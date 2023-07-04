import java.util.ArrayList;
import java.util.List;

public class Arrays11 {

    public List<Integer> findDuplicates(int[] nums) {
        /*We can also use the approach of counting. 
        Since the numbers can only be between 1 to n. 
        1. We will create a new array of length n+1.
        2. increase the value at its index position.
        3. if the value is greater than 1 then add into list. */

        List<Integer> ans = new ArrayList<>();
        int arr[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            if(arr[nums[i]] == 1){
                ans.add(nums[i]);
            }else{
                arr[nums[i]] = 1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        //442. Find All Duplicates in an Array

    }
}
