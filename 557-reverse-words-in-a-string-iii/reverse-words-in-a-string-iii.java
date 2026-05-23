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

        //It also has high time complexity

        /*String arr[] = s.split(" ");

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

        return sb.toString();*/

        /*String arr[] = s.split(" ");
        StringBuilder reversed = new StringBuilder();

        for(int i=0 ; i<arr.length ; i++){
            StringBuilder word = new StringBuilder(arr[i]);
            word.reverse();

            reversed.append(word + " ");

        }

        return reversed.toString().trim();*/

        char[] chars = s.toCharArray();
        int n = chars.length;

        int i = 0;
        // finding starting word
        while ( i < n ) {
            while ( i < n && chars[i] == ' ') {
                i++;
            }
            // finding end of word
            int j = i;
            while ( j < n && chars[j] != ' '){
                j++;
            }
            reverse (chars , i, j - 1);

        
        i = j + 1;
    }
    return new String(chars);

   }
        // helper to reverse the part of array

    private void reverse (char  [] chars, int left , int right ) {
        while (left <  right) {
            char temp = chars [left];
            chars[left] = chars[right];
            chars[right] = temp;
            left ++;
            right --;
        }
}

}