class Solution {
    public int removePalindromeSub(String s) {
        int n = s.length();

        if(n == 0){
            return 0;
        }

        boolean isPalin = true;

        int i = 0;
        int j = n-1;

        while(i < j){
            if(s.charAt(i) != s.charAt(j)){
                isPalin = false;
            }
            i++;
            j--;
        }

        if(isPalin){
            return 1;
        }

        return 2;
    }
}