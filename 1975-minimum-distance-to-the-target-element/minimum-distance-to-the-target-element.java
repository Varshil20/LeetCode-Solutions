class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int idx = -1;
        int ans = nums.length;
        for(int i = start ; i < nums.length + start ; i++){
            if(nums[i%nums.length] == target){
                idx = i%nums.length;
                ans = Math.min(ans , Math.abs(start - idx));
            }
        }

        return ans;
    }
}