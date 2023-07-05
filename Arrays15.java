public class Arrays15 {
    public int maxScore(int[] cp, int k) {
        int sum =0;
        for(int i=0;i<k;i++){
            sum += cp[i];
        }
        int curr = sum;
        for(int i=k-1;i>=0;i--){
            curr -= cp[i];
            curr += cp[cp.length-k+i];
            sum = Math.max(sum, curr);
        }
        return sum;
    }
    public static void main(String[] args) {
        //Leetcode 1423. Maximum Points You Can Obtain from Cards

    }
}
