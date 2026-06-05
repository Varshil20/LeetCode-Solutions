class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int res = 0;
        int n = arr.length;

        for(int i = 0 ; i < n ; i++){
            int k = (i + 1) * (n - i) + 1;
            k = k/2;

            res += k*arr[i];
        }

        return res;
    }
}