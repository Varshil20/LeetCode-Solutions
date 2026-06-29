class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        int n = word.length();

        for(int k = 0 ; k < patterns.length ; k++){
            String str = patterns[k];
            int m = str.length();

            if(m > n){
                continue;
            }
            boolean found = false;
            for (int i = 0; i <= word.length() - m; i++) {
                int j = 0;

                while (j < m && word.charAt(i + j) == str.charAt(j)) {
                    j++;
                }

                if (j == m) {
                    found = true;
                    break;
                }
            }

            if (found) ans++;
        }

        return ans;
    }
}