public class Arrays9 {

    public int maxProfit(int[] prices) {
        int profit = 0, minPrices = Integer.MAX_VALUE;
        //traversing prices
        for(int i=0;i<prices.length;i++){
            //finding min
            minPrices = Math.min(minPrices, prices[i]);
            if(prices[i] > minPrices){
                profit += prices[i] - minPrices;
                minPrices = prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        //122. Best Time to Buy and Sell Stock II

    }
}
