class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        int i = 0;
        int j = arr.length - 1;

        while(i < j){
            if(!Character.isLetter(arr[i])){
                i++;
            }

            else if(!Character.isLetter(arr[j])){
                j--;
            }

            else{
                swap(arr , i , j);
                i++;
                j--;
            }

        }
        return new String(arr);
    }

    private void swap(char arr[] , int x , int y){
        char ch = arr[x];
        arr[x] = arr[y];
        arr[y] = ch;
    }
}