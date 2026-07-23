class Solution {
    public int uniqueXorTriplets(int[] nums) {

        int n = nums.length;

        // If there are only 1 or 2 elements, the number of unique XOR values
        // is simply equal to the number of available elements.
        if (n == 1 || n == 2) {
            return n;
        }

        // We need the smallest power of 2 that is strictly greater than n.
        // For numbers from 1 to n, XOR can produce every value in the range
        // [0, 2^k - 1], where 2^k is the first power of 2 greater than n.
        int ans = 1;

        while (ans <= n) {
            // Multiply by 2 using left shift.
            // Keeps moving to the next power of 2:
            // 1 -> 2 -> 4 -> 8 -> 16 -> ...
            ans = ans << 1;
        }

        // 'ans' is now the smallest power of 2 greater than n.
        // This equals the total number of distinct XOR values possible.
        return ans;
    }
}