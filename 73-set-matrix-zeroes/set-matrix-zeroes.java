class Solution {
    public void setZeroes(int[][] matrix) {
        //HIGH TIME COMPLEXITY

        /* int check [][] = new int [matrix.length][matrix[0].length];
        
        for(int i=0 ; i<matrix.length ; i++){
            Arrays.fill(check[i],-1);
        }
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                int rI = -1;
                int cI = -1;
                
                if(matrix[i][j] == 0){
                    rI = i;
                    cI = j;
        
                    for(int p=0 ; p<n ; p++){
                        check[rI][p] = 0;
                    }
        
                    for(int q=0 ; q<m ; q++){
                        check[q][cI] = 0;
                    }
                }
               
            }
        }
        
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){
                if(check[i][j] == 0){
                    matrix[i][j] =0;
                }
            }
        } */

        int m = matrix.length;
        int n = matrix[0].length;

        boolean row[] = new boolean[m];
        boolean col[] = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (row[i] || col[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}