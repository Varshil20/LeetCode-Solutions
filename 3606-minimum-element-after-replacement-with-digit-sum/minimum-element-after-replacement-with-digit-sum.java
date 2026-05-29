class Solution {
    public int minElement(int[] nums) {
        int minsum = Integer.MAX_VALUE;

        for(int i = 0 ; i < nums.length ; i++){
            int temp = nums[i];
            int sum = 0;

            while(temp > 0){
                sum = sum + temp%10;
                temp /= 10;
            }
            nums[i] = sum;
            minsum = Math.min(sum,minsum);
        }

        return minsum;
    }
}