import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Arrays13
 */
public class Arrays13 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue; //checking if prev ele is same as the curr
            int j = i+1;
            int k = nums.length -1;
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];
                if(sum < 0){  //total < 0 => increase the j as array is sorted. 
                    j++;
                }else if(sum > 0){ //total > 0 => decrease the k as array is sorted. 
                    k--;
                }else{
                    //adding the the elements
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    ans.add(a);
                    //moving j and k until we get the differnet element.
                    j++;
                    k--;
                    while(j<k && nums[j-1] == nums[j]) j++;
                    while(j<k && nums[k] == nums[k+1]) k--;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //15. 3Sum

    }
}