public class Arrays3 {

    public int maxProfit(int[] prices) {
        int maxPr = 0;
        int bp = prices[0], sp;
        for(int i=1;i<prices.length;i++){
            sp = prices[i];
            if(bp<sp){
                int p = sp-bp;
                maxPr = Math.max(maxPr, p);
            }
            else{
                bp = sp;
            }
        }
        return maxPr;
    }
    public static void main(String[] args) {
        //Leetcode Question - 121. Best Time to Buy and Sell Stock

    }
}
