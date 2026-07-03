class Solution {
    public int gcdOfOddEvenSums(int n) {

        /* int sumOdd = n * n;
        int sumEven = n * (n + 1);
        return gcd(sumOdd, sumEven);
        }
        
        private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;*/

        /*If you add up the first n odd numbers (1 + 3 + 5 + …), you always get n × n.
        If you add up the first n even numbers (2 + 4 + 6 + …), you always get n × (n + 1).
        GCD of 2 number (n 
        2
        ,n.(n+1)) is the highest number with which both numbers are completely divisble. The only number that divides both n² and n × (n + 1) is n itself.
        So the final answer would be n.*/

        return n;
    }
}