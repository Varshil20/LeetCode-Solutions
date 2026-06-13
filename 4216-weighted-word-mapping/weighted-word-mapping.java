class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder(words.length);

        for(int  i = 0 ; i < words.length ; i++){
            int totalweight = 0;
            String crntword = words[i];
            int j = 0;

            while(j < crntword.length()){
                char ch = crntword.charAt(j);
                totalweight += weights[ch - 'a'];
                j++;
            }

            char newchar = (char)('a' + (25 - (totalweight % 26)));
            sb.append(newchar);
        }

        return sb.toString();
    }
}