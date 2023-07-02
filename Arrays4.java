import java.util.*;

public class Arrays4 {
    public static int findDiff(int[] arr, int m){
        //extreme cases
        // 1. if array or m is empty
        if(arr.length == 0 || m == 0){
            return 0;
        }
        // 2. if no of students is greater than total packets
        if(arr.length < m){
            return -1;
        } 

        int minDiff = Integer.MAX_VALUE;

        //sort the array.
        Arrays.sort(arr);

        //Two Pointer Approach
        int first = 0, sec = m-1;
        while(sec < arr.length){
            minDiff = Math.min(minDiff, arr[sec] - arr[first]);
            first++;
            sec++;
        }

        return minDiff;
    }
    public static void main(String[] args) {

        //GFG Question: Chocolate Distribution Problem
        // https://www.geeksforgeeks.org/chocolate-distribution-problem/

        int arr[] = { 12, 4,  7,  9,  2,  23, 25, 41, 30,
                      40, 28, 42, 30, 44, 48, 43, 50 };
        int m = 7; // Number of students

        System.out.println("Minimum Difference is: " + findDiff(arr, m));
    }
}
