class Solution {
    public List<List<Integer>> generate(int numRows) {

        //reffered the strivers video
        //Done the optimal solution using previously calculaed ans
        //You can find the perticular element by using the formula of nCr where n = row -1 ans r = col - 1;
        //Anthe the formula of nCr is n!/(r! * (n-r)!);

        
        List<List<Integer>> ans = new ArrayList<>();

        for(int row = 1 ; row <=numRows ; row++){
            ans.add(genrow(row));
        }

        return ans;
    }

    private List<Integer> genrow(int row) {
        List<Integer> temp = new ArrayList<Integer>();
        long ans = 1;
        temp.add(1);
        for (int col = 1; col < row; col++) {
            ans = ans * (row - col);
            ans = ans / (col);

            temp.add((int)ans);
        }

        return temp;
    }
}