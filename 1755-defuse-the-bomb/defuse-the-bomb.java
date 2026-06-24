class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] ans = new int[n];

        if (k == 0) {
            return ans;
        }

        int start, end;

        // Define the initial window
        if (k > 0) {
            start = 1;
            end = k;
        } else {
            k = -k;
            start = n - k;
            end = n - 1;
        }

        // Calculate initial window sum
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += code[i];
        }

        // Sliding window over the circular array
        for (int i = 0; i < n; i++) {
            ans[i] = sum;

            // Remove current start element
            sum -= code[start % n];

            // Move window forward
            start++;
            end++;

            // Add new end element
            sum += code[end % n];
        }

        return ans;
    }
}