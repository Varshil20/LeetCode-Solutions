class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<Integer>();

        int less = 0;
        int same = 0;

        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] < target){
                less++;
            }
            else if(nums[i] == target){
                same++;
            }
        }

        while(same != 0){
            ans.add(less);
            less++;
            same--;
        }

        return ans;
    }
}