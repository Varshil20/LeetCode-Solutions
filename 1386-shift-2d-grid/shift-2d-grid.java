class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        /*int row = grid.length;
        int col = grid[0].length;
        int n = row*col;
        k = k%n;

        int arr[] = new int[n];
        int idx = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < col ; j++){
                arr[idx++] = grid[i][j];
            }
        }

        swap(arr , 0 , n-1);
        swap(arr , 0 , k-1);
        swap(arr , k , n-1);
        
        idx = 0;
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < row; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                list.add(arr[idx++]);
            }
            ans.add(list);
        }

        return ans;*/

        //ANOTHER METHOD

        int row = grid.length;
        int col = grid[0].length;

        int n = row*col;
        k = k%n;

        swap(grid , 0 , n-1 , col);
        swap(grid , 0 , k-1 , col);
        swap(grid , k , n-1 , col);

        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < row; i++) {
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                list.add(grid[i][j]);
            }
            ans.add(list);
        }

        return ans;
    }

    private void swap(int arr[][] , int i , int j , int col){
                while(i < j){
                    int temp = arr[i/col][i%col];
                    arr[i/col][i%col] = arr[j/col][j%col];
                    arr[j/col][j%col] = temp;
                    i++;
                    j--;
                }
    }

    /* private void swap(int arr[] , int i , int j){
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }*/
}