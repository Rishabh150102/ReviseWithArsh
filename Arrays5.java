public class Arrays5 {

    public int findDuplicate(int[] nums) {
        int temp[] = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(temp[nums[i]] > 0){
                return nums[i];
            }else{
                temp[nums[i]] = 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        //287. Find the Duplicate Number

    }
}
