import java.util.HashMap;
import java.util.Map;

public class Arrays8 {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        //traversing the nums and keeping values as keys and indexes as values
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], i);
        }

        //traversing and each time calculating the its complement
        for(int i=0;i<nums.length;i++){
            int comp = target - nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                return new int[] {i, map.get(comp)};
            }}
        }

       
    public static void main(String[] args) {
        //1. Two Sum

    }
}
