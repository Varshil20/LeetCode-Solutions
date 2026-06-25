class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        //BRUTE FORCE
        int ans = 0;

        for(int i = 0 ; i < nums.length ; i++){
            int targetCount = 0;

            for(int l = i ; l < nums.length ; l++){
                if(nums[l] == target){
                    targetCount++;
                }

                int len = l - i + 1;

                if(targetCount > len / 2){
                    ans++;
                }

            }
        }

        return ans;
    }
}