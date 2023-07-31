import java.util.List;

/**
 * Arrays14
 */
public class Arrays14 {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length < 4){
            return ans;
        }
        if(nums.length == 4){
            long sum = (long)nums[0] + nums[1] + nums[2] + nums[3];
            if(sum == (long)target){
                List<Integer> a = new ArrayList<>();
                a.add(nums[0]);
                a.add(nums[1]);
                a.add(nums[2]);
                a.add(nums[3]);
                ans.add(a);
                return ans;                
            }else{
                return ans;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i] == nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                int k = j+1, l = nums.length-1;
                while(k<l){
                    int sum = nums[i] + nums[j] + nums[k] + nums[l];
                    if(sum < target){
                        k++;
                        while(k<l && nums[k] == nums[k-1]) k++;
                    }else if(sum > target){
                        l--;
                        while(k<l && nums[l] == nums[l+1]) l--;
                    }else{
                        List<Integer> a = new ArrayList<>();
                        a.add(nums[i]);
                        a.add(nums[j]);
                        a.add(nums[k]);
                        a.add(nums[l]);
                        ans.add(a);

                        k++;
                        l--;
                        while(k<l && nums[k-1] == nums[k]) k++;
                        while(k<l && nums[l+1] == nums[l]) l--;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //18. 4Sum

    }
}