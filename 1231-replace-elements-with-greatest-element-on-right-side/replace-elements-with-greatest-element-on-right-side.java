class Solution {
    public int[] replaceElements(int[] arr) {
        int nextgreater = -1;
        int ans[] = new int[arr.length];

        for(int i = arr.length - 1 ; i>=0 ; i--){
            ans[i] = nextgreater;

            if(arr[i] > nextgreater) {
                nextgreater = arr[i];
            }
        }

        return ans;
    }
}