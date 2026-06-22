class Solution {
    public int maxNumberOfBalloons(String text) {
        int freq[] = new int[5];
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

        return total;       
    }
}