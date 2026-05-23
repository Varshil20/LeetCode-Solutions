class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        //HIGH SPACE COMPLEXITY

        /*String s1 = "";
        for(int i=0 ; i<word1.length ; i++){
            s1 += word1[i];
        }

        String s2 = "";
        for(int i=0 ; i<word2.length ; i++){
            s2 += word2[i];
        }

        return s1.equals(s2);*/

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();
        for(int i = 0; i<word1.length; i++){
            str1.append(word1[i]);
        }

        for(int i = 0; i<word2.length; i++){
            str2.append(word2[i]);
        }
        return str1.toString().equals(str2.toString());
    }
}