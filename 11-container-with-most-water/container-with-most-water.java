class Solution {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length-1;
        int max = Integer.MIN_VALUE;
        int crntMax = 0;

        while(l < r){
            if(height[r] > height[l]){
                crntMax = (height[l] * (r - l));
                l++;
            }
            else{
                crntMax = (height[r] * (r-l));
                r--;
            }

            max = Math.max(max , crntMax);
        }

        return max;
    }
}