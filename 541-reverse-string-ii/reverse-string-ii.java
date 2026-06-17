class Solution {
    public String reverseStr(String s, int k) {
        int skip = 2*k;
        char arr[] = s.toCharArray();
        int n = s.length();

        for(int i = 0 ; i < s.length() ; i+=skip){
            int j = Math.min(i + k - 1,n - 1);

            reverse(i,j,arr);
        }

        return new String(arr);
    }

    private void reverse(int start , int end , char arr[]){
        while(start < end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

    }
}