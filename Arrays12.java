public class Arrays12 {

    public int maxArea(int[] height) {
        int lp = 0, rp = height.length-1;
        int water = 0;
        int h = 0, w=0;
        while(lp<rp){
            h = Math.min(height[lp], height[rp]);
            w = rp - lp;
            water = Math.max(water, h*w);
            if(height[lp] < height[rp]){
                lp++;
            }else{
                rp--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        //11. Container With Most Water

    }
}
