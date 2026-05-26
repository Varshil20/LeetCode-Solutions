class Solution {
    public int countCharacters(String[] words, String chars) {
        int charsfreq[] = new int[26];
        
        for(int i = 0 ; i<chars.length() ; i++){
            charsfreq[chars.charAt(i) - 'a']++;
        }

        int count = 0;

        for(int i = 0 ; i < words.length ; i++){
            String crntword = words[i];
            int temp[] = charsfreq.clone();
            boolean flag = true;

            for(int j = 0 ; j < crntword.length() ; j++){
                char ch = crntword.charAt(j);

                if(temp[ch - 'a'] > 0){
                    temp[ch - 'a']--;

                    if(temp[ch - 'a'] < 0){
                        flag = false;
                        break;
                    }
                }
                else{
                    flag = false;
                    break;
                }
            }
            if(flag){
                count += crntword.length();
            }
        }

        return count;
    }
}