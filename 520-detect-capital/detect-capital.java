class Solution {
    public boolean detectCapitalUse(String word) {
        char arr[] = word.toCharArray();
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

        return false;
    }
}