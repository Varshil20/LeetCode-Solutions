class Solution {
    public int countNegatives(int[][] grid) {


        /*int count = 0 ;

        for(int i = grid.length-1 ; i>=0 ; i--){
            for(int j = grid[0].length-1 ; j>=0 ; j--){
                if(grid[i][j] < 0){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;*/

        //ANOTHER METHOD

        int m = grid.length;
        int n = grid[0].length;

        int row=0;
        int col=n-1;
        int count = 0;

        while(row < m && col >= 0){
            if(grid[row][col] < 0){
                count += (m - row);   //all the element below will be zero
                col--;
            }
            else{
                row++;
            }
        }

        return count;
    }
}