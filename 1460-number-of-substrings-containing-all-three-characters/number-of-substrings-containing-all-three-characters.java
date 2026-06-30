class Solution {
    public int numberOfSubstrings(String s) {
        //BRUTE FORCE
        //TIME LIMIT EXCEEDED

        /*int ans = 0;
        for(int i = 0 ; i < s.length() ; i++){
            int hash[] = new int[3];

            for(int j = i ; j < s.length() ; j++){
                char ch = s.charAt(j);

                hash[ch - 97] = 1;

                if(hash[0] + hash[1] + hash[2] == 3){
                    ans++;
                }
            }
        }

        return ans;*/

        int hash[] = new int[]{-1,-1,-1};
        int ans = 0;

        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);

            hash[ch - 97] = i;

            if(hash[0] + hash[1] + hash[2] >= 3){
                ans += 1 + (int)Math.min(hash[0] , Math.min(hash[1] , hash[2]));
            }
        }

        return ans;
    }
}