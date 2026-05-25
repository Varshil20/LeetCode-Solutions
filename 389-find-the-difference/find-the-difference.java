class Solution {
    public char findTheDifference(String s, String t) {
        
        //HIGH TIMECOMPLEXITY AND SPACE COMPLEXITY

        /*int freq[] = new int[26];

        for(int i=0 ; i<s.length() ; i++){
            freq[s.charAt(i) - 97]++;
        }
        
        for(int i=0 ; i<t.length() ; i++){
           freq[t.charAt(i)-97]--;
           if(freq[t.charAt(i)-97] == -1){
            return  t.charAt(i);
           }
        }
        return ' ';*/

        //ANOTHER METHOD

        int sum=0;

        for(int i=0 ; i<t.length() ; i++){
            sum += t.charAt(i);
        }

        for(int i=0 ; i<s.length() ; i++){
            sum-=s.charAt(i);
        }

        return (char)sum;
    }   
}