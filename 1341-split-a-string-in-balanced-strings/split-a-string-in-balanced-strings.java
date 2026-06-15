class Solution {
    public int balancedStringSplit(String s) {
        char ch = s.charAt(0);
        int same = 1;
        int split = 0;

        for(int i = 1 ; i < s.length() ; i++){
            char newch = s.charAt(i);

            if(newch == ch){
                same++;
            }
            else{
                same--;
            }

            if(same == 0){
                split++;
            }
        }

        return split;
    }
}