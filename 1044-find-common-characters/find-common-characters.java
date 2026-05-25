class Solution {
    public List<String> commonChars(String[] words) {
        int com[] = new int[26];

        //for first word
        for(int i=0 ; i<words[0].length() ; i++){
            com[words[0].charAt(i)-'a']++;
        }

        for(int i=1 ; i<words.length ; i++){
            int crnt[] = new int[26];

            for(int j =0 ; j < words[i].length() ; j++){ //freq of character of every word
                crnt[words[i].charAt(j) - 'a']++;
            }

            for(int k=0 ; k<com.length ; k++){   //keep only min freq in com array
                com[k] = Math.min(com[k],crnt[k]);
            }
        }

        List<String> list = new ArrayList<String>();

        for(int i=0 ; i<com.length ; i++){
            if(com[i] != 0){
                char ch = (char)(i+97);
                int count = com[i];
                while(count > 0){
                list.add(Character.toString(ch));
                count--;
                }
            }
        }

        return list;
    }
}