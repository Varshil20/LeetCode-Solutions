class Solution {
    public String truncateSentence(String s, int k) {

        /*String splitarr[] = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i < k ; i++){
            sb.append(splitarr[i] + " ");
        }

        return sb.toString().trim();*/

        //ANOTHER METHOD

        int count = 0;
        int idx = -1;

        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == ' '){
                count++;
            }

            if(count == k){
                idx = i;
                break;
            }
        }

        return (idx != -1) ? s.substring(0,idx) : s;
    }
}