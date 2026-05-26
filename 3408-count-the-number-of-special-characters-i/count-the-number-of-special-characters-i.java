class Solution {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        boolean lower[] = new boolean[26];
        boolean upper[] = new boolean[26];

        for(int i = 0 ; i <word.length() ; i++){
            char ch = word.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                lower[ch - 'a'] = true;
            }
            else{
                upper[ch - 'A'] = true;
            }
        }

        for(int i = 0 ; i < lower.length ; i++){
            if(lower[i] && upper[i]){
                count++;
            }
        }

        return count;
    }
}