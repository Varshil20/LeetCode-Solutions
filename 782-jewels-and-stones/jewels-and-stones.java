class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean set[] = new boolean[52];

        for(int i = 0 ; i < jewels.length() ; i++){
            char ch = jewels.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                set[ch - 'a'] = true;
            }
            else{
                set[ch - 'A' + 26] = true;
            }
        }
        int count = 0;

        for(int i = 0 ; i < stones.length() ; i++){
            char ch = stones.charAt(i);

            if(ch >= 'a' && ch <= 'z'){
                if(set[ch - 'a']){
                    count++;
                }
            }
            else{
                if(set[ch - 'A' + 26]){
                    count++;
                }
            }
        }

        return count;
    }
}