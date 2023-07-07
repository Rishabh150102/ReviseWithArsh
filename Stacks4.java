import java.util.HashMap;
import java.util.Stack;

/**
 * Stacks4
 */
public class Stacks4 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //finding out next greater for all elements
        Stack<Integer> stack = new Stack<>();
        int nextGreater[] = new int[nums2.length];

        //traverse from back
        for(int i=nums2.length-1;i>=0;i--){
            while(!stack.empty() && nums2[stack.peek()] <= nums2[i]){
                stack.pop();
            }
            if(stack.empty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = nums2[stack.peek()];
            }

            //pushing the element's index
            stack.push(i);
        }
        //implementing hash map for storing index of elements
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums2.length;i++){
            map.put(nums2[i], i);
        }
        int ans[] = new int[nums1.length];
        for(int i=0;i<ans.length;i++){
            ans[i] = nextGreater[map.get(nums1[i])];
        }

        return ans;
    }
    public static void main(String[] args) {
        //Leetcode 496. Next Greater Element I

    }
}