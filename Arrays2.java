import java.util.ArrayList;

public class Arrays2 {

    public void moveZeroes(int[] nums) {
        //extreme cases 1
        if(nums.length == 1){
            return;
        }
        //make another temp arrayList
        ArrayList<Integer> temp = new ArrayList<>();

        //store all the values except 0
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                temp.add(nums[i]);
            }
        }
        //extreme case 2
        if(temp.size() == nums.length){
            return;
        }
        int size = temp.size();
        for(int i=0;i<size;i++){
            nums[i] = temp.get(i);
        }
        //set remaining elements 0
        for(int i=size;i<nums.length;i++){
            nums[i] = 0;
        }
    }
    public static void main(String[] args) {
        //Question 283 - Leetcode - Move Zeros
    }
}
