class Solution {
    public boolean isThree(int n) {

        int divisor = 0;

        for(int i = 2 ; i <= n/2 ; i++){
            if(n % i == 0){
                divisor++;
            }

            if(divisor > 1){
                return false;
            }
        }

        return divisor==1;
    }
}