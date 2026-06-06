class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int presum[] = new int[n];
        int sufsum[] = new int[n];
        int ans[] = new int[n];

        for(int i = 1 ; i < n ; i++){
            presum[i] = presum[i-1] + nums[i-1];
            sufsum[n-1-i] = sufsum[n-i] + nums[n-i];
        }

        for(int i = 0 ; i < n ; i++){
            ans[i] = Math.abs(presum[i] - sufsum[i]);
        }

        return ans;
    }
}