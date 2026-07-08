class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {
        /*long MOD = 1_000_000_007;
        int len = s.length();

        long[] preSum = new long[len + 1];
        long[] preProduct = new long[len + 1];
        int[] nonZeroCnt = new int[len + 1];
        long[] p10 = new long[len + 1];

        p10[0] = 1;
        for (int i = 0; i < len; i++) {
            p10[i + 1] = (p10[i] * 10) % MOD;

            int digit = s.charAt(i) - '0';
            preSum[i + 1] = preSum[i] + digit;

            if (digit == 0) {
                preProduct[i + 1] = preProduct[i];
                nonZeroCnt[i + 1] = nonZeroCnt[i];
            } else {
                preProduct[i + 1] = (preProduct[i] * 10 + digit) % MOD;
                nonZeroCnt[i + 1] = nonZeroCnt[i] + 1;
            }
        }

        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];

            long sum = preSum[end + 1] - preSum[start];

            int cnt = nonZeroCnt[end + 1] - nonZeroCnt[start];

            long subtract = (preProduct[start] * p10[cnt]) % MOD;
            long x = (preProduct[end + 1] - subtract + MOD) % MOD;

            res[i] = (int) ((x * sum) % MOD);
        }

        return res;*/

        int n = s.length();
        long mod = 1000000007L;

        // Precompute powers of 10 modulo 10^9 + 7 to avoid precision issues
        long[] power10 = new long[n + 1];
        power10[0] = 1;
        for (int i = 1; i <= n; i++) {
            power10[i] = (power10[i - 1] * 10) % mod;
        }

        long[] sumUpto = new long[n];
        long[] numberUpto = new long[n];
        int[] nonZeroUpto = new int[n]; // New array to track non-zero digits
        
        long sum = 0;
        long num = 0;
        int nonZeros = 0;

        for (int i = 0; i < n; i++) {
            int crntDigit = s.charAt(i) - '0';

            sum += crntDigit;
            
            // Only update the number and non-zero count if the digit is valid
            if (crntDigit != 0) {
                num = (num * 10 + crntDigit) % mod;
                nonZeros++;
            }

            sumUpto[i] = sum;
            numberUpto[i] = num;
            nonZeroUpto[i] = nonZeros;
        }

        int[] ans = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            long sumbetLtoR = 0;
            long numbetLtoR = 0;

            if (l != 0) {
                sumbetLtoR = sumUpto[r] - sumUpto[l - 1];
                
                // Number of NON-ZERO digits in the prefix to subtract
                int count = nonZeroUpto[r] - nonZeroUpto[l - 1]; 
                numbetLtoR = (numberUpto[r] - (numberUpto[l - 1] * power10[count]) % mod + mod) % mod;
            } else {
                sumbetLtoR = sumUpto[r];
                numbetLtoR = numberUpto[r];
            }

            ans[i] = (int) ((numbetLtoR * (sumbetLtoR % mod)) % mod);
        }

        return ans;
    }
}