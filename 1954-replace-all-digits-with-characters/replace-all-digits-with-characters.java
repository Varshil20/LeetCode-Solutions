class Solution {
    public String replaceDigits(String s) {

        StringBuilder sb = new StringBuilder();
        
        for(int i = 1 ; i < s.length() ; i+=2){
           sb.append(s.charAt(i-1));
           sb.append(shift(s.charAt(i-1),s.charAt(i)));
        }
        if(s.length() % 2 == 1){
            sb.append(s.charAt(s.length()-1));
        }
        
        return sb.toString();
        }
        
        private char shift(char x , char n ){
        return (char)(x + (n - '0'));

        //ANOTHER METHOD 

        /*StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length() - 1; i += 2) {
            char ch = s.charAt(i);
            ans.append(ch);
            int num = s.charAt(i + 1) - '0';
            char shifted = ((char) (ch + num));
            ans.append(shifted);
        }
        if (s.length() % 2 == 1)
            ans.append(s.charAt(s.length() - 1));
        return ans.toString();*/
    }
}