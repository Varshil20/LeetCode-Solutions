class Solution {
    public int[] searchRange(int[] nums, int target) {
        /*int first = findMid(0, nums.length - 1, nums, target, true);

        if (first == -1) {
            return new int[]{-1, -1};
        }

        int last = findMid(first, nums.length - 1, nums, target, false);

        return new int[]{first, last};
    }

    private int findMid(int start, int end, int[] arr, int target, boolean first) {
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                ans = mid;

                if (first) {
                    end = mid - 1;      // keep searching left
                } else {
                    start = mid + 1;    // keep searching right
                }
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans; */

        //ANOTHER WAY INWHICH TAKE TWO LOOPS FOR LEFT SIDE AND RIGHT SIDE

        int left = firstIdx(nums , target);

        if(left == -1){
            return new int[]{-1 , -1};
        }

        int right = lastIdx(nums , target);

        return new int[]{left , right};
    }

    private int firstIdx(int []nums ,int target){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }
            else if(nums[mid] > target){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }

        return ans;
    }

    private int lastIdx( int [] nums , int target){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while(start <= end){
           int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }

            else if(nums[mid] > target){
                end = mid - 1;
            }

            else{
                start = mid +1;
            }
            
        }

        return ans;
    }
}