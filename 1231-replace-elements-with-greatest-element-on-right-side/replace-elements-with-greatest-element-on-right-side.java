class Solution {
    public int[] replaceElements(int[] arr) {


        /*int nextgreater = -1;
        int ans[] = new int[arr.length];

        for(int i = arr.length - 1 ; i>=0 ; i--){
            ans[i] = nextgreater;

            if(arr[i] > nextgreater) {
                nextgreater = arr[i];
            }
        }

        return ans;*/


        //RETURN THE SAME ARR

        int max = arr[arr.length - 1];
        arr[arr.length - 1] = -1;

        for(int i = arr.length - 2 ; i>=0 ; i--){
            int crnt = arr[i];
            arr[i] = max;

            if(crnt > max){
                max = crnt;
            }
        }

        return arr;
    }
}