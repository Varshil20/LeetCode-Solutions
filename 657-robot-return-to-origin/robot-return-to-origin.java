class Solution {
    public boolean judgeCircle(String moves) {

        /*int up = 0;
        int right = 0;

        for(int i = 0 ; i < moves .length() ; i++){
            char ch = moves.charAt(i);

            if(ch == 'U'){
                up++;
            }

            else if(ch == 'R'){
                right++;
            }

            else if(ch == 'D'){
                up--;
            }
            else{
                right--;
            }
        }

        return (up == 0 && right == 0);*/

        //OR YOU CAN DO IT WITH FREQUENCY

        int freq[] = new int[26];

        for(int i = 0 ; i < moves.length() ; i++){
            freq[moves.charAt(i) - 'A']++;
        }

        if(freq[20]!=freq[3] || freq[11]!=freq[17]){ //this index is for U D L R
            return false;
        }

        return true;

    }
}