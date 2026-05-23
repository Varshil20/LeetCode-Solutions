class Solution {
    public String reverseWords(String s) {

        //HIGH TIME COMPLEXITY

        /*int start = 0;
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

        return sb.toString();*/

        //ANOTHER SOLUTION

        String arr[] = s.split(" ");

        StringBuilder sb = new StringBuilder();

        for(int j=0 ; j<arr.length ; j++){
            String str = arr[j];

            for(int i = str.length()-1 ; i>=0 ; i--){
                sb.append(str.charAt(i));
            }

            if(j < arr.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}