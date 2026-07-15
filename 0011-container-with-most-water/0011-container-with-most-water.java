class Solution {


    public int maxArea(int[] height) {
        int lp = 0;
        int rp = height.length-1;
        int mw = 0;

        while(lp<rp){
            int h = Math.min(height[lp], height[rp]);
            int w = rp - lp;
            int cw = h*w ;
             
            mw = Math.max(mw, cw);

            if(height[lp]<height[rp]){
                lp++;
            }else{
                rp--;
            }

        }
        return mw;

    }
}