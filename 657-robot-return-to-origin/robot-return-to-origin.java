class Solution {
    public boolean judgeCircle(String moves) {
        int up = 0;
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

        return (up == 0 && right == 0);
    }
}