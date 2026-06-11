class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int magazinefreq[] = new int[26];

        for(int i = 0 ; i < magazine.length() ; i++){
            char ch = magazine.charAt(i);
            magazinefreq[ch - 'a']++;
        }

        for(int i = 0 ; i < ransomNote.length() ; i++){
            char ch = ransomNote.charAt(i);

            if(magazinefreq[ch - 'a'] == 0){
                return false;
            }
            else{
                magazinefreq[ch - 'a']--;
            }
        }

        return true;
    }
}