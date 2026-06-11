class Solution {
    public boolean detectCapitalUse(String word) {

        //DIFICULT METHOD

        /*char arr[] = word.toCharArray();
        if(arr.length == 0 || arr.length == 1){
            return true;
        }

        if(isUpper(arr[0])){
            boolean firstState = isUpper(arr[1]);

            for(int i = 2 ; i < arr.length ; i++){
                boolean crntState = isUpper(arr[i]);
                if(firstState != crntState){
                    return false;
                }
            }
        }
        else{
            for(int i = 1 ; i < arr.length ; i++){
                if(isUpper(arr[i])){
                    return false;
                }
            }
        }

        return true;
    }

    private boolean isUpper(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            return true;
        }

        return false;*/

        //ANOTHER EASY METHOD by countting capital words

        int c = 0;

        for(int i = 0 ; i < word.length() ; i++){
            char ch = word.charAt(i);

            if(ch >= 'A' && ch <= 'Z'){
                c++;
            }
        }

        if(c == 0 || c == word.length() || (c == 1 && word.charAt(0) >= 'A' && word.charAt(0)<= 'Z')){
            return true;
        }

        return false;
    }
}