public class Arrays7 {

    public int removeDuplicates(int[] nums) {
        int cnt = 1, p=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] != nums[i+1]){
                //counting the duplicate elements
                cnt++;
                //shifting the next digit to previous each time
                nums[p] = nums[i+1];
                //increasing the pointer p
                p++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        //26. Remove Duplicates from Sorted Array

    }
}
