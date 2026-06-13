class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder sb = new StringBuilder();

        for(int  i = 0 ; i < words.length ; i++){
            int totalweight = 0;
            String crntword = words[i];
            int j = 0;

            while(j < crntword.length()){
                char ch = crntword.charAt(j);
                totalweight += weights[ch - 'a'];
                j++;
            }

            char newchar = (char)(26 - (totalweight % 26) - 1 + 97);
            sb.append(newchar);
        }

        return sb.toString();
    }
}