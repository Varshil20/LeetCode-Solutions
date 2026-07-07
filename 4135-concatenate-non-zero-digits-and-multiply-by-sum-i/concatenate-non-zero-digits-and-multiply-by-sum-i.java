class Solution {
    public long sumAndMultiply(int n) {

        if(n < 10){
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

        return nonzero * sum;
    }
}