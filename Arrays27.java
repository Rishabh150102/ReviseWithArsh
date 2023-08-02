/**
 * Arrays27
 */
public class Arrays27 {

    public int largestRectangleArea(int[] arr) {
        //finding the next smaller element
        int nextSmallerLeft[] = new int[arr.length];

        Stack<Integer> stack = new Stack<>();

        //we have to push the index of next greater element.
        // therefore we have to modify code little bit

        //traverse from start
        for(int i=0;i<arr.length;i++){
            while(!stack.empty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                nextSmallerLeft[i] = -1;
            }else{
                nextSmallerLeft[i] = stack.peek();
            }

            //pushing the element's index
            stack.push(i);
        }

        stack.clear(); //clearing all the elements from stack

        //finding next smaller right
        int nextSmallerRight[] = new int[arr.length];

        //traverse from back
        for(int i=arr.length-1;i>=0;i--){
            while(!stack.empty() && arr[stack.peek()] >= arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                nextSmallerRight[i] = arr.length; //assign the length to calculate correct width
            }else{
                nextSmallerRight[i] = stack.peek();
            }

            //pushing the element's index
            stack.push(i);
        }

        //finding the max area
        int width, area = 0;
        for(int i=0;i<arr.length;i++){
            width = nextSmallerRight[i] - nextSmallerLeft[i] - 1;
            area = Math.max(area, (arr[i] * width));
        }

        return area;
    }

    public static void main(String[] args) {
        //84. Largest Rectangle in Histogram

    }
}