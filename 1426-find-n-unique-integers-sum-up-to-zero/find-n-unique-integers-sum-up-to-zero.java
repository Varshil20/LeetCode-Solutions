class Solution {
    public int[] sumZero(int n) {
        int x = n/2;

        int ans[] = new int[n];
        int l = 0;
        int r = ans.length-1;

        while(l <= r){
            ans[l] = -x;
            ans[r] = x;
            l++;
            r--;
            x--;
        }

        return ans;
    }
}