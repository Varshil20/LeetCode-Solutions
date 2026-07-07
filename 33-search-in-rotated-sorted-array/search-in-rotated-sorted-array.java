class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int k = 0;

        for(int i = 1 ; i < n ; i++){
            if(nums[i] < nums[i-1]){
                k = i;
                break;
            }
        }

        int start = k;
        int end = n-1+k;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid % n] == target){
                ans = mid%n;
                break;
            }

            else if(nums[mid % n] > target){
                end = mid - 1;
            }
            
            else{
                start = mid + 1;
            }
        }

        return ans;
    }
}