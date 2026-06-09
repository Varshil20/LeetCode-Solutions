class Solution {
    public String truncateSentence(String s, int k) {
        String splitarr[] = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < k ; i++){
            sb.append(splitarr[i] + " ");
        }

        return sb.toString().trim(); 
    }
}