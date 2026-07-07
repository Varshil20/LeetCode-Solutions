class Solution {
    public long sumAndMultiply(int n) {

       /* if(n < 10){
            return n*n;
        }

        StringBuilder sb = new StringBuilder();
        int sum = 0;

        while(n != 0){
            int digit = n%10;

            if(digit != 0){
                sum += digit;
                sb.insert(0,digit);
            }

            n /= 10;
        }

        long nonzero = Integer.parseInt(sb.toString());

        return nonzero * sum;*/

        //WITHOUT STRINGBUILDER

        int ans = 0;
        int sum = 0;
        int i = 1;

        while(n != 0){
            int digit = n%10;

            if(digit != 0){
                sum += digit;

                ans += (digit * i);
                i *= 10;
            }

            n /= 10;
        }

        return (long) ans * sum;
    }
}