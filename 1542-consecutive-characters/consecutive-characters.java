class Solution {
    public int maxPower(String s) {
        int crnt = 1;
        int max = 1;

        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                crnt++;
                max = Math.max(crnt , max);
            }
            else{
                crnt = 1;
            }
        }

        return max;
    }
}