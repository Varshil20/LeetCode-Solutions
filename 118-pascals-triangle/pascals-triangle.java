class Solution {
    public List<List<Integer>> generate(int numRows) {
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