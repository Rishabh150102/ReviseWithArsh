public class Arrays6 {

    public void sortColors(int[] nums) {
        int count0 = 0, count1 = 0, count2 = 0;
        //counting
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                count0++;
            }else if(nums[i] == 1){
                count1++;
            }else{
                count2++;
            }
        } 
        //placing them in nums
        for(int i=0;i<nums.length;i++){
            if(count0 > 0){
                nums[i] = 0;
                count0--;
            }else if(count1 > 0){
                nums[i] = 1;
                count1--;
            }else{
                nums[i] = 2;
                count2--;
            }
        }
    }
    public static void main(String[] args) {
        //75. Sort Colors

    }
}
