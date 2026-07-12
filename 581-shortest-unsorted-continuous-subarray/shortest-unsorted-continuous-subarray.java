class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int first = -1;
        int last = -1;

        int max = nums[0];
        int min = nums[n - 1];

        for (int i = 1; i < n; i++) {
            max = Math.max(max, nums[i]);
            if (nums[i] < max) {
                last = i;
            }

            min = Math.min(min, nums[n - 1 - i]);
            if (nums[n - 1 - i] > min) {
                first = n - 1 - i;
            }
        }

        if (last == -1) return 0;

        return last - first + 1;
    }
}