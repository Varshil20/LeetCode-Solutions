class Solution {
    public int maximumPopulation(int[][] logs) {
        int year[] = new int[101];

        for(int i = 0 ; i < logs.length ; i++){
            year[logs[i][0] - 1950]++;
            year[logs[i][1] - 1950]--;
        }

        int maxYear = 1950;
        int preSum = year[0];

        for(int i = 1 ; i < year.length ; i++){
            year[i]  += year[i-1];

            if(year[i] > preSum){
                preSum = year[i];
                maxYear = i + 1950;
            }
        }

        return maxYear;
    }
}