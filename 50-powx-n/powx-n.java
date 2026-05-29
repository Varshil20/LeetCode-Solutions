class Solution {
    public double myPow(double x, int n) {

        //COMPLEX METHOD

        /*if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        double pow = 1;
        while (n != 0) {
            if ((n & 1) != 0) // equivalent to if((n % 2) != 0) i.e. multiply only when the number is odd  
                pow *= x;

            x *= x;
            n >>>= 1; // equivalent to n = n / 2; i.e. keep dividing the number by 2

        }
        return pow;*/

        //ANOTHER METHOD

        double ans = 1;
        long nn = n;
        if(n<0){
            nn = -nn;
        }

        while(nn != 0){
            if(nn % 2 != 0){
                ans = ans * x;
                nn = nn-1;
            }
            else{
            x = x*x;
            nn = nn/2;
            }
        }

        return (n < 0) ? 1/ans : ans;
    }
}