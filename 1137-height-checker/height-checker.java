class Solution {
    public int heightChecker(int[] heights) {

        /*int[] expected = heights.clone();
        Arrays.sort(expected);
        int count = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != expected[i])
                count++;
        }
        return count;*/

        //ANOTHER METHOD;

        int count[] = new int[101];

        for(int i = 0 ; i < heights.length ; i++){
            count[heights[i]]++;
        }

        int ans = 0;
        int h = 1;

        for(int i = 0 ; i < heights.length ; i++){
            while(count[h] == 0){
                h++;
            }

            if(heights[i] != h){
                ans++;
            }

            count[h]--;
        }

        return ans;
    }
}