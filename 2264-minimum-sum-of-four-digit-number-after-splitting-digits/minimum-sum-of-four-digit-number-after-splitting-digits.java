class Solution {
    public int minimumSum(int num) {
        int[] toSort = new int[4];
        for (int i = 3; i >= 0; i--) {
            toSort[i] = num % 10;
            num /= 10;
        }
        Arrays.sort(toSort);
        return (toSort[0] * 10 + toSort[2]) + (toSort[1] * 10 + toSort[3]);
    }
}