class Solution {
    public String reverseWords(String s) {
        int start = 0;
        int end = 0;
        StringBuilder sb = new StringBuilder();

        while(end < s.length()){
            while(end < s.length() && s.charAt(end) != ' '){
                end++;
            }

            for(int i=end-1 ; i>=start ; i--){
                sb.append(s.charAt(i));
            }

            if(end < s.length()){
                sb.append(" ");
            }
            
            end++;
            start = end;
        }

        return sb.toString();
    }
}