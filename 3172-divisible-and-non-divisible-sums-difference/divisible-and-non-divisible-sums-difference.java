class Solution {
    public int differenceOfSums(int n, int m) {
        int total = (n*(n+1)) / 2;

        int temp = m;
        while(temp <= n){
            total = total - (temp * 2);
            temp += m;
        }

        return total;
    }
}