class Solution {
    public char findTheDifference(String s, String t) {
        int freq[] = new int[26];

        for(int i=0 ; i<s.length() ; i++){
            freq[s.charAt(i) - 97]++;
        }
        
        for(int i=0 ; i<t.length() ; i++){
           freq[t.charAt(i)-97]--;
           if(freq[t.charAt(i)-97] == -1){
            return  t.charAt(i);
           }
        }
        return ' ';
    }
}