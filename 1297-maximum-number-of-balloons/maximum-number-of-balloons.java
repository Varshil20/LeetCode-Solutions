class Solution {
    public int maxNumberOfBalloons(String text) {
        /*int freq[] = new int[5];
        String temp = "balon";

        for(int i = 0 ; i < text.length() ; i++){
            for(int j = 0 ; j < 5 ; j++){
                if(text.charAt(i) == temp.charAt(j)){
                    freq[j]++;
                }
            }
        }

        freq[2] /= 2;
        freq[3] /= 2;

        int total = freq[0];

        for(int i = 1 ; i < 5 ; i++){
            total = Math.min(total,freq[i]);
        }

        return total;*/


        //Another method

         int b = 0, a = 0, l = 0, o = 0, n = 0;
        
        // Count frequencies of the required characters
        for (char c : text.toCharArray()) {
            switch (c) {
                case 'b': b++; break;
                case 'a': a++; break;
                case 'l': l++; break;
                case 'o': o++; break;
                case 'n': n++; break;
            }
        }
        
        // 'l' and 'o' are needed twice per word, so divide their counts by 2
        l = l / 2;
        o = o / 2;
        
        // The answer is the limiting factor among all required letters
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
    }
}