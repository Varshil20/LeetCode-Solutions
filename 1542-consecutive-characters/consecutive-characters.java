class Solution {
    public int maxPower(String s) {
        int crnt = 1;
        int max = 1;

        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i) == s.charAt(i-1)){
                crnt++;
            }
            else{
                max = Math.max(crnt , max);
                crnt = 1;
            }
        }

        return Math.max(max , crnt);
    }
}