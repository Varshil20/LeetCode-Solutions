class Solution {
    public int countMajoritySubarrays(int[] nums, int target) {
        //BRUTE FORCE
        /*int ans = 0;

        for(int i = 0 ; i < nums.length ; i++){
            int targetCount = 0;

            for(int j = i ; j < nums.length ; j++){
                if(nums[j] == target){
                    targetCount++;
                }

                int len = j - i + 1;

                if(targetCount > len / 2){
                    ans++;
                }

            }
        }

        return ans;*/

        //SIMPLIFIED BRUTEFORCE

        int ans = 0;
        for(int i = 0 ; i < nums.length ; i++){
            int count = 0;
            for(int j = i ; j < nums.length ; j++){
                if(nums[j] == target){
                    count++;
                }
                else{
                    count--;
                }

                if(count > 0){
                    ans++;
                }
            }
        }
        
        return ans;
    }
}